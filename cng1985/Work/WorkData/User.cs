using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data.OleDb;
using System.Data.Common;
using MySql.Data.MySqlClient;
namespace Work.WorkData
{
   public class User
    {
        public bool Login(string name, string password)
        {
            DbConnection con = new MySql.Data.MySqlClient.MySqlConnection();
            MySqlConnectionStringBuilder conb = new MySqlConnectionStringBuilder();
            conb.Database = "work";
            conb.UserID = "root";
            conb.Password = "root";
            conb.Port = 3306;
            conb.Server = "localhost";
            con.ConnectionString = conb.ConnectionString;
            string sql = @"SELECT   LoginName, LoginPassword
          FROM      [User]
                WHERE   (LoginName = ?) AND (LoginPassword = ?)";
             DbCommand cmd = new MySqlCommand();
            cmd.Connection = con;
            cmd.CommandText = sql;
            con.Open();
          DbDataReader reader=cmd.ExecuteReader();
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
