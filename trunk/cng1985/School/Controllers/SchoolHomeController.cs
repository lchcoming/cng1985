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
                home.News.Add("������鲻��������鲻��");
            }
            for (int i = 0; i < 16; i++)
            {
                home.Notice.Add("�Һú��ҹ���������鲻��");
            }
            for (int i = 0; i < 16; i++)
            {
                home.Lost.Add("����û��ȡ��Ǯ������鲻��");
            }
            for (int i = 0; i < 16; i++)
            {
                home.Work.Add("����ȫ�ǹ���������鲻��");
            }
            return View(home);
        }

    }
}
