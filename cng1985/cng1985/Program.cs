using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

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
          
            for (int i = 0; i < 1000; i++)
            {
                web.Work += new EventHandler(web_Work);
            }
            web.Work+=new EventHandler(web_Work);
            web.Test();
            Console.Read();
        }

        static void web_Work(object sender, EventArgs e)
        {
            Console.Write("123\n");
        }
    }
}
