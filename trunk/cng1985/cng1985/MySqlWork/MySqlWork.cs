using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MySql.Data.MySqlClient;
using System.Data.Common;
namespace cng1985.MySqlWork
{
    class MySqlWork
    {
        public void run() {
            MySqlConnection con = new MySql.Data.MySqlClient.MySqlConnection();
            MySqlConnectionStringBuilder conb = new MySqlConnectionStringBuilder();
            conb.Database = "work";
            conb.UserID = "root";
            conb.Password = "root";
            conb.Port = 3306;
            conb.Server = "localhost";
            con.ConnectionString = conb.ConnectionString;
            string sql = "insert into message values (?a,?b,?c)";
            MySqlCommand cmd = new MySqlCommand();
            cmd.CommandText = sql;
            cmd.Connection = con;
            cmd.Parameters.AddWithValue("?a","ada");
            cmd.Parameters.AddWithValue("?b",DateTime.Now);
            cmd.Parameters.AddWithValue("?c",1);
            con.Open();
            try
            {
                cmd.ExecuteNonQuery();
            }
            catch (Exception e)
            {

                Console.WriteLine(e.Message);
            }
           
        }
    }
}
