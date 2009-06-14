using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Mvc.Ajax;
using School.LinqModle;
namespace School.Controllers
{
    public class NewManagerController : Controller
    {
        //
        // GET: /NewManager/

        public ActionResult Index()
        {
            return View();
        }
        public ActionResult AddType()
        {
            return View();
        }
        [AcceptVerbs(HttpVerbs.Post)]
        public ActionResult AddType(NewsSubType type)
        {
            DataClasses1DataContext entity = new DataClasses1DataContext();
            type.NewsType = 1;
            entity.NewsSubType.InsertOnSubmit(type);
            entity.SubmitChanges();
            return View();
        }
        public ActionResult AddNews()
        {
            DataClasses1DataContext entity = new DataClasses1DataContext();
            var result = from c in entity.NewsSubType
                         select c;
            ViewData["nestype"] = result.ToList();
            return View();
        }
        [AcceptVerbs(HttpVerbs.Post)]
        public ActionResult AddNews(News news)
        {
            DataClasses1DataContext entity = new DataClasses1DataContext();
            news.PupTime = DateTime.Now;
            entity.News.InsertOnSubmit(news);
            entity.SubmitChanges();
            return this.RedirectToAction("AddNews");
        }
    }
}
