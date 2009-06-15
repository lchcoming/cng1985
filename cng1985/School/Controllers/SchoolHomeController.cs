using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Mvc.Ajax;
using School.SchoolModle;
namespace School.Controllers
{
    public class SchoolHomeController : Controller
    {
        //
        // GET: /SchoolHome/

        public ActionResult Index()
        {
            SchoolHome home = new SchoolHome();
            for (int i = 0; i < 16; i++)
            {
                home.News.Add("最近心情不错最近心情不错");
            }
            for (int i = 0; i < 16; i++)
            {
                home.Notice.Add("我好好找工作最近心情不错");
            }
            for (int i = 0; i < 16; i++)
            {
                home.Lost.Add("今天没有取到钱最近心情不错");
            }
            for (int i = 0; i < 16; i++)
            {
                home.Work.Add("天下全是工作最近心情不错");
            }
            return View(home);
        }

    }
}
