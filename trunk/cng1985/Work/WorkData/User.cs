using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data.OleDb;
namespace Work.WorkData
{
   public class User
    {
        public bool Login(string name, string password)
        {
            string c = @"Provider=Microsoft.Jet.OLEDB.4.0;Data Source=|DataDirectory|\Data\papaonline.mdb;Persist Security Info=True";
            OleDbConnection con = new OleDbConnection(c);
            string sql = @"SELECT   LoginName, LoginPassword
          FROM      [User]
                WHERE   (LoginName = ?) AND (LoginPassword = ?)";
            OleDbCommand cmd = new OleDbCommand();
            cmd.Connection = con;
            cmd.CommandText = sql;
            con.Open();
          OleDbDataReader reader=cmd.ExecuteReader();
          if (reader.Read())
          {
              con.Close();
              return true;
             
          }
          else {
              con.Close();
              return false;
          }
           
        }
    }

}
