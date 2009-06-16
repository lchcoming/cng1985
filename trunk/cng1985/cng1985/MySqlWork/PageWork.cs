using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace cng1985.MySqlWork
{
    class PageWork
    {
        public void run()
        {
            for (int i = 1; i < 20; i++)
            {
                Page(i);
            }
            for (int j = 20; j > 0; j--)
            {
                Page(j);
            }
        
        }

        private static void Page(int curpage)
        {
            int star = 0;
            int end = 0;
            if (curpage > 3)
            {
                star = curpage - 3;
                end = curpage + 3;
            }
            if (curpage <= 3) {
                star = 1;
                end = 7;
            }
            for (int i = star; i < end; i++)
            {
                Console.Write("{0}\t",i);
            }
            Console.WriteLine("\n+++++++++++++++++");
        }
    }
}
