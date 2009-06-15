using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using cng1985.LinqModle;
namespace cng1985.SqlWork
{
    class PageWork
    {
        public List<Province> GetPage(int page)
        {
            List<Province> result = new List<Province>();
            DataClasses1DataContext entity=new DataClasses1DataContext();
            List<Province> all = entity.Province.ToList();
            int alld = (page-1) * 10;
            int i = 0;
            foreach (var item in all)
            {
                if (i >= alld && i < (page * 10))
                {
                    result.Add(item);
                }
                i++;
            }
            return result;
        }
    }
}
