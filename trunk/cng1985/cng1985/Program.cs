﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Net;
using System.Threading;
using System.Security.Cryptography;
using System.IO;
using Microsoft.VisualBasic;
using System.Data.Common;
using MySql.Data.MySqlClient;
using cng1985.LinqModle;
using cng1985.SqlWork;
using cng1985.MySqlWork;
namespace cng1985
{
    class Program
    {
        static void Main(string[] args)
        {
            DataClasses1DataContext entity = new DataClasses1DataContext();
            var result = from c in entity.City
                         select c;
           var a= result.Skip(10).Take(2);
           var b = a.Take(10);
           foreach (var item in b)
           {
               Console.WriteLine(item.CityName);
           }
            Console.Read();
        }

        private static void NewMethod()
        {
            MySafe mys = new MySafe();
            Console.WriteLine(mys.EncryptString("ada.young"));
            Console.WriteLine(mys.DecryptString(mys.EncryptString("ada.young")));
            MakeSafe safe = new MakeSafe();
            Console.WriteLine(safe.EncryptString("ada"));
            Console.WriteLine(safe.DecryptString(safe.EncryptString("ada")));
            AdaMd5 mds = new AdaMd5();
            mds.Md5Source = new SHA512Cng();
            Console.WriteLine(mds.getMd5Hash("ada"));
            Console.WriteLine(mds.verifyMd5Hash("ada", mds.getMd5Hash("ada")));
            cng1985.MySqlWork.PageWork ww = new cng1985.MySqlWork.PageWork();
            ww.run();
            Work work = new Work();
            // work.Run();
            int show = 19968;
            //for (int i = 900; i < 1000; i++)
            //{
            //    MakeString s = new MakeString();
            //    Console.WriteLine(s.GetString(i));
            //}

            //for (int i = 19968; i < 25000; i++)
            //{
            //    Random generator = new Random((int)DateTime.Now.Ticks);
            //    int randomValue;

            //    randomValue = generator.Next(19968, 40869);
            //    Thread.Sleep(1);
            //    char ss = (char)i;
            //    Console.WriteLine(ss);
            //}
            // Console.WriteLine(Strings.StrConv(b.ToString(), VbStrConv.SimplifiedChinese, 0));
            cng1985.SqlWork.PageWork page = new cng1985.SqlWork.PageWork();
            for (int i = 1; i < 5; i++)
            {
                List<Province> a = page.GetPage(i);
                foreach (var item in a)
                {
                    Console.WriteLine(item.Name);
                }
                Console.WriteLine("++++++++++++++++++++++++++++++++++++");
            }

            //LinqDataTest();
            //DbConnection con = new MySql.Data.MySqlClient.MySqlConnection();
            //MySqlConnectionStringBuilder conb = new MySqlConnectionStringBuilder();
            //conb.Database = "work";
            //conb.UserID = "root";
            //conb.Password = "root";
            //conb.Port = 3306;
            //conb.Server = "localhost";
            //con.ConnectionString = conb.ConnectionString;
            //            string sql = @"SELECT   LoginName, LoginPassword
            //          FROM      user
            //                WHERE   (LoginName = ?) AND (LoginPassword = ?)";
            //            DbCommand cmd = new MySqlCommand();
            //            cmd.Connection = con;
            //            cmd.CommandText = sql;
            //con.Open();
            //DbDataReader reader = cmd.ExecuteReader();


            //DbConnection con = new MySql.Data.MySqlClient.MySqlConnection();
            //MySqlConnectionStringBuilder conb = new MySqlConnectionStringBuilder();
            //conb.Database = "work";
            //conb.UserID = "root";
            //conb.Password = "root";
            //conb.Port = 3306;
            //conb.Server = "localhost";
            //con.ConnectionString = conb.ConnectionString;
            //            string sql = @"SELECT   LoginName, LoginPassword
            //          FROM      user
            //                WHERE   (LoginName = ?) AND (LoginPassword = ?)";
            //            DbCommand cmd = new MySqlCommand();
            //            cmd.Connection = con;
            //            cmd.CommandText = sql;
            //con.Open();
            //DbDataReader reader = cmd.ExecuteReader();


            DESCryptoServiceProvider key = new DESCryptoServiceProvider();
            // Encrypt a string to a byte array.
            byte[] buffer = Encrypt("This is some plaintext! 我是你爷爷", key);
            Console.WriteLine(Encoding.Unicode.GetString(buffer));
            // Decrypt the byte array back to a string.
            string plaintext = Decrypt(buffer, key);

            // Display the plaintext value to the console.
            Console.WriteLine(plaintext);

            string source = "Hello World!";

            string hash = getMd5Hash(source);
            Console.WriteLine(hash.Length);

            Console.WriteLine("The MD5 hash of " + source + " is: " + hash + ".");

            Console.WriteLine("Verifying the hash...");

            if (verifyMd5Hash(source, hash))
            {
                Console.WriteLine("The hashes are the same.");
            }
            else
            {
                Console.WriteLine("The hashes are not same.");
            }
            if (verifyMd5HashCryp(source, hash))
            {
                Console.WriteLine("The hashes are the same.");
            }
            else
            {
                Console.WriteLine("The hashes are not same.");
            }
            Console.WriteLine(getMd5HashSHA512Cng(source));
        }

        private static void DateEntity()
        {
        //    WorkEntities entity = new WorkEntities();
        //    var resut = from c in entity.City
        //                //select c;
        //                //// where c.ID == 2
        //                select new
        //                {
        //                    Name = c.CityName,
        //                    Pname = c.Province.Name
        //                };
        //    foreach (var item in resut)
        //    {
        //        //item.Name = item.Name.Trim();
        //        //Console.WriteLine(item.Name);
        //        //Console.WriteLine(item.ModifiedDate);  
        //        // item.ModifiedDate = DateTime.Now;
        //        Console.WriteLine("你现在所在的城市是{0}省{1}市\n+++", item.Pname, item.Name);
        //    }
        //    entity.SaveChanges();
        }

        //private static void LinqDataTest()
        //{
          
        //    DataClasses1DataContext entity = new DataClasses1DataContext();
        //    var r = from c in entity.CountryRegion
        //            //where c.School.ID == 1
        //            select new
        //            {
        //                Name = c.Name,
        //                School = (from ada in entity.Province
        //                          where ada.CountryRegion == c.ID
        //                          select ada
        //                            )
        //            };
        //    foreach (var item in r)
        //    {
        //        Console.WriteLine(item.Name);
        //        //Console.Write(item.School);
        //        foreach (var itemd in item.School)
        //        {
        //            Console.WriteLine(itemd.Name);
        //            var ss = from df in entity.City
        //                     where df.ProvinceID == itemd.ID
        //                     select df;
        //            foreach (var itemc in ss)
        //            {
        //                Console.WriteLine(itemc.CityName);
        //            }
        //            Console.WriteLine("++++++++++");
        //        }


        //    }
        //}

        private static void Visiat(WebWork web)
        {
            for (int i = 0; i < 50; i++)
            {
                web.Work += new EventHandler(web_Work);
                web.AddThread(() =>
                {

                    while (true)
                    {
                        try
                        {
                            HttpWebRequest request = HttpWebRequest.Create("http://cng1985.googlepages.com") as HttpWebRequest;
                            HttpWebResponse respon = request.GetResponse() as HttpWebResponse;
                            Console.WriteLine(respon.ContentLength);
                            Console.WriteLine(request.HaveResponse);
                            WebHeaderCollection myWebHeaderCollection = respon.Headers;
                            for (int h = 0; h < myWebHeaderCollection.Count; h++)
                            {
                                String header = myWebHeaderCollection.GetKey(i);
                                String[] values =
                                    myWebHeaderCollection.GetValues(header);
                                if (values.Length > 0)
                                {
                                    Console.WriteLine("The values of {0} header are : "
                                                     , header);
                                    for (int j = 0; j < values.Length; j++)
                                        Console.WriteLine("\t{0}", values[j]);
                                }
                                else
                                    Console.WriteLine("There is no value associated" +
                                        "with the header");

                            }
                            foreach (var item in myWebHeaderCollection)
                            {
                                Console.WriteLine(item);
                            }
                            // Console.WriteLine(respon.geth);
                            Console.WriteLine(request.Connection);
                            // Thread.Sleep(2000);
                            Random generator = new Random();
                            int randomValue;

                            randomValue = generator.Next(10, 10000);
                            Console.WriteLine(randomValue);
                            Console.WriteLine("访问成功");
                            respon.Close();
                        }
                        catch (Exception e)
                        {
                            Console.WriteLine(e.Message);

                        }
                    }
                });
            }
        }

        static void web_Work(object sender, EventArgs e)
        {
            Console.Write("123\n");
            //HttpWebRequest request = HttpWebRequest.Create("http://lxks2003.blog.163.com") as HttpWebRequest;
            //HttpWebResponse respon = request.GetResponse() as HttpWebResponse;
            //Console.WriteLine(respon.ContentLength);
            //Console.WriteLine(request.HaveResponse);
            //Console.WriteLine(request.Connection);
            //Thread.Sleep(2000);
            //Console.WriteLine("访问成功");
            //respon.Close();
        }
        static string getMd5Hash(string input)
        {
            // Create a new instance of the MD5CryptoServiceProvider object.
            MD5 md5Hasher = MD5.Create();

            // Convert the input string to a byte array and compute the hash.
            byte[] data = md5Hasher.ComputeHash(Encoding.Default.GetBytes(input));

            // Create a new Stringbuilder to collect the bytes
            // and create a string.
            StringBuilder sBuilder = new StringBuilder();

            // Loop through each byte of the hashed data 
            // and format each one as a hexadecimal string.
            for (int i = 0; i < data.Length; i++)
            {
                sBuilder.Append(data[i].ToString("x2"));
            }

            // Return the hexadecimal string.
            return sBuilder.ToString();
        }
        static bool verifyMd5Hash(string input, string hash)
        {
            // Hash the input.
            string hashOfInput = getMd5Hash(input);

            // Create a StringComparer an comare the hashes.
            StringComparer comparer = StringComparer.OrdinalIgnoreCase;

            if (0 == comparer.Compare(hashOfInput, hash))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        static string getMd5HashCryp(string input)
        {
            // Create a new instance of the MD5CryptoServiceProvider object.
            MD5CryptoServiceProvider md5Hasher = new MD5CryptoServiceProvider();

            // Convert the input string to a byte array and compute the hash.
            byte[] data = md5Hasher.ComputeHash(Encoding.Default.GetBytes(input));

            // Create a new Stringbuilder to collect the bytes
            // and create a string.
            StringBuilder sBuilder = new StringBuilder();

            // Loop through each byte of the hashed data 
            // and format each one as a hexadecimal string.
            for (int i = 0; i < data.Length; i++)
            {
                sBuilder.Append(data[i].ToString("x2"));
            }

            // Return the hexadecimal string.
            return sBuilder.ToString();
        }

        // Verify a hash against a string.
        static bool verifyMd5HashCryp(string input, string hash)
        {
            // Hash the input.
            string hashOfInput = getMd5HashCryp(input);

            // Create a StringComparer an compare the hashes.
            StringComparer comparer = StringComparer.OrdinalIgnoreCase;

            if (0 == comparer.Compare(hashOfInput, hash))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        static string getMd5HashCng(string input)
        {
            // Create a new instance of the MD5CryptoServiceProvider object.
            MD5Cng md5Hasher = new MD5Cng();

            // Convert the input string to a byte array and compute the hash.
            byte[] data = md5Hasher.ComputeHash(Encoding.Default.GetBytes(input));

            // Create a new Stringbuilder to collect the bytes
            // and create a string.
            StringBuilder sBuilder = new StringBuilder();

            // Loop through each byte of the hashed data 
            // and format each one as a hexadecimal string.
            Console.WriteLine(data.Length);
            for (int i = 0; i < data.Length; i++)
            {
                sBuilder.Append(data[i].ToString("x2"));
            }

            // Return the hexadecimal string.
            return sBuilder.ToString();
        }

        // Verify a hash against a string.
        static bool verifyMd5HashCng(string input, string hash)
        {
            // Hash the input.
            string hashOfInput = getMd5HashCng(input);

            // Create a StringComparer an compare the hashes.
            StringComparer comparer = StringComparer.OrdinalIgnoreCase;

            if (0 == comparer.Compare(hashOfInput, hash))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        static string getMd5HashSHA512Cng(string input)
        {
            // Create a new instance of the MD5CryptoServiceProvider object.
            SHA512Cng md5Hasher = new SHA512Cng();

            // Convert the input string to a byte array and compute the hash.
            byte[] data = md5Hasher.ComputeHash(Encoding.Default.GetBytes(input));

            // Create a new Stringbuilder to collect the bytes
            // and create a string.
            StringBuilder sBuilder = new StringBuilder();

            // Loop through each byte of the hashed data 
            // and format each one as a hexadecimal string.
            Console.WriteLine(data.Length);
            for (int i = 0; i < data.Length; i++)
            {
                sBuilder.Append(data[i].ToString("x2"));
            }

            // Return the hexadecimal string.
            return sBuilder.ToString();
        }

        // Verify a hash against a string.
        static bool verifyMd5HashSHA512Cng(string input, string hash)
        {
            // Hash the input.
            string hashOfInput = getMd5HashSHA512Cng(input);

            // Create a StringComparer an compare the hashes.
            StringComparer comparer = StringComparer.OrdinalIgnoreCase;

            if (0 == comparer.Compare(hashOfInput, hash))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        // Encrypt the string.
        public static byte[] Encrypt(string PlainText, SymmetricAlgorithm key)
        {
            // Create a memory stream.
            MemoryStream ms = new MemoryStream();

            // Create a CryptoStream using the memory stream and the 
            // CSP DES key.  
            CryptoStream encStream = new CryptoStream(ms, key.CreateEncryptor(), CryptoStreamMode.Write);

            // Create a StreamWriter to write a string
            // to the stream.
            StreamWriter sw = new StreamWriter(encStream);

            // Write the plaintext to the stream.
            sw.WriteLine(PlainText);

            // Close the StreamWriter and CryptoStream.
            sw.Close();
            encStream.Close();

            // Get an array of bytes that represents
            // the memory stream.
            byte[] buffer = ms.ToArray();
            // Close the memory stream.
            ms.Close();

            // Return the encrypted byte array.
            return buffer;
        }

        // Decrypt the byte array.
        public static string Decrypt(byte[] CypherText, SymmetricAlgorithm key)
        {
            // Create a memory stream to the passed buffer.
            MemoryStream ms = new MemoryStream(CypherText);

            // Create a CryptoStream using the memory stream and the 
            // CSP DES key. 
            CryptoStream encStream = new CryptoStream(ms, key.CreateDecryptor(), CryptoStreamMode.Read);

            // Create a StreamReader for reading the stream.
            StreamReader sr = new StreamReader(encStream);

            // Read the stream as a string.
            string val = sr.ReadLine();
            // Close the streams.
            sr.Close();
            encStream.Close();
            ms.Close();

            return val;
        }

    }
}
