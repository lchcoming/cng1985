using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Net;
using System.Threading;
namespace cng1985
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("haha");
            Console.Write("hello ");
            WebWork web = new WebWork();
            web.Run();

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
            web.Work += new EventHandler(web_Work);
            web.Test();
            ThreadStart star = () => { };

            web.Run();
            Console.Read();
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
    }
}
