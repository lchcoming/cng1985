using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace cng1985
{
    class Chinese
    {
        public void Run()
        {
            string ada = "你是谁";
            char[] d = ada.ToCharArray();
            foreach (var item in d)
            {
                Console.WriteLine(item.GetTypeCode());
                Console.WriteLine((char)((int)item - 43));
            }
            char a = '陈';
            int aa = (int)a;
            Console.WriteLine(aa);
            char b = '陳';
            int bb = (int)b;
            Console.WriteLine(bb);
            Console.WriteLine(bb - aa);
           
        }


    }
}
