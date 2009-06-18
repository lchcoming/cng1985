using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using Microsoft.VisualBasic;
namespace cng1985
{
    class MakeString
    {
        public string GetString(int lenth) {
            if (lenth < 5) {
                lenth = 5;
            };
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < lenth; i++)
            {
                Random generator = new Random((int)DateTime.Now.Ticks);
                int randomValue;

                randomValue = generator.Next(19968, 40869);
                Thread.Sleep(1);
                char ss = (char)randomValue;
                b.Append(ss);
            }
            return Strings.StrConv(b.ToString(), VbStrConv.SimplifiedChinese, 0);
        }
    }
}
