using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Mvc.Ajax;
using School.LinqModle;
namespace School.Controllers
{
    public class NewsController : Controller
    {
        //
        // GET: /News/

        public ActionResult Index()
        {
            DataClasses1DataContext entity = new DataClasses1DataContext();
            var result = from c in entity.News
                         orderby c.NewsSubType
                         select c;
           
            
            ViewData["result"] = result.ToList();
            return View();
        }

    }
}
