using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data.SqlClient;
using System.Threading;
namespace cng1985.SqlWork
{
    class Work
    {
        public void Run()
        {
            List<Thread> threads = new List<Thread>();
            for (int i = 0; i < 102; i++)
            {
                threads.Add(new Thread(new ThreadStart(delegate
                {

                    SqlConnectionStringBuilder conb = new SqlConnectionStringBuilder();
                    conb.UserID = "sa";
                    conb.Password = "123456789123";
                    conb.InitialCatalog = "work";
                    conb.DataSource = ".";
                    conb.Pooling = true;
                    Console.WriteLine(conb.ConnectionString);
                    SqlConnection con = new SqlConnection(conb.ConnectionString);
                    con.Open();
//                    string sql = @"SELECT [ID]
//      ,[Name]
//      ,[CountryRegion]
//      ,[ModifiedDate]
//  FROM [work].[dbo].[Province]";
//                    SqlCommand cmd = new SqlCommand();
//                    cmd.CommandText = sql;
//                    cmd.Connection = con;
//                    SqlDataReader reader = cmd.ExecuteReader();
//                    while (reader.Read())
//                    {
//                        Console.WriteLine(reader.GetString(1));
//                    }
//                    con.Close();
                })));
            }
            foreach (var item in threads)
            {
                item.Start();
            }

        }
    }
}
