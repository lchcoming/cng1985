using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Mvc.Ajax;
using School.LinqModle;
using System.Data.SqlClient;
using System.Configuration;
namespace School.Controllers
{
    public class MessageController : Controller
    {
        //
        // GET: /Message/

        public ActionResult Index(int? page)
        {
            if (page == null)
            { page = 1; }

            DataClasses1DataContext entity = new DataClasses1DataContext();
            int allpage = entity.Message.Count();
            int pagemar = (allpage-1)/ 15 + 1;
            List<Message> m = entity.PageMessage(page - 1, 15).ToList();
            ViewData["message"] = m;
            ViewData["page"] = page;
            ViewData["pagemax"] = pagemar;
            return View();
        }
        //[AcceptVerbs(HttpVerbs.Post)]
        //public ActionResult Index(int? page)
        //{
        //    if (page == null)
        //    { page = 1; }
        //    DataClasses1DataContext entity = new DataClasses1DataContext();
        //    int allpage = entity.Message.Count();
        //    int pagemar = allpage / 3 + 1;
        //    List<Message> m = entity.PageMessage(page - 1, 3).ToList();
        //    ViewData["message"] = m;
        //    ViewData["page"] = page;
        //    ViewData["pagemax"] = pagemar;
        //    return View();
        //}
        //
        // GET: /Message/Details/5

        public ActionResult Details(int id)
        {
            DataClasses1DataContext entity = new DataClasses1DataContext();
            var result = from c in entity.Message
                         where c.ID == id
                         select c;
            

            return View(result.FirstOrDefault());
        }

        //
        // GET: /Message/Create

        public ActionResult Create()
        {
            return View();
        }

        //
        // POST: /Message/Create

        [AcceptVerbs(HttpVerbs.Post)]
        public ActionResult Create(FormCollection collection)
        {
            try
            {

                Message a = new Message();
                a.Message1 = collection["Message1"];
                a.Title = collection["Title"];
                a.UserID = 1;
                DataClasses1DataContext entity = new DataClasses1DataContext();
                entity.Message.InsertOnSubmit(a);
                entity.SubmitChanges();
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }

        //
        // GET: /Message/Edit/5

        public ActionResult Edit(int id)
        {
            DataClasses1DataContext entity = new DataClasses1DataContext();
            var result = from c in entity.Message
                         where c.ID == id
                         select c;


            return View(result.FirstOrDefault());
        }

        //
        // POST: /Message/Edit/5

        [AcceptVerbs(HttpVerbs.Post)]
        public ActionResult Edit(int id, FormCollection collection)
        {
            try
            {
                DataClasses1DataContext entity = new DataClasses1DataContext();
                var result = from c in entity.Message
                             where c.ID == id
                             select c;
                Message a =result.FirstOrDefault();
                a.Message1 = collection["Message1"];
                a.Title = collection["Title"];
                a.UserID = 1;
                entity.SubmitChanges();

                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }
        public ActionResult List()
        {
            return View();
        }
        public void AddMessage(Message message) {
            SqlConnectionStringBuilder conb = new SqlConnectionStringBuilder();
            conb.DataSource = ".";
            conb.UserID = "sa";
            conb.Password = "123456789123";
            conb.InitialCatalog = "webwork";
            conb.MinPoolSize = 50;
            conb.MaxPoolSize = 200;
            conb.Pooling = true;
            SqlConnection con = new SqlConnection(conb.ConnectionString);//(ConfigurationManager.ConnectionStrings["webworkConnectionString"].ConnectionString);
            string sql=@"INSERT INTO [webwork].[dbo].[Message]
           ([Title]
           ,[Message]
           ,[UserID])
     VALUES
           (@a,@b,@c)";
            SqlCommand cmd = new SqlCommand();
            cmd.CommandText = sql;
            cmd.Connection = con;
            cmd.Parameters.AddWithValue("@a",message.Title);
            cmd.Parameters.AddWithValue("@b",message.Message1);
            cmd.Parameters.AddWithValue("@c",1);
            con.Open();
            cmd.ExecuteNonQuery();
            con.Close();
            //DataClasses1DataContext entity = new DataClasses1DataContext();
            //entity.Message.InsertOnSubmit(message);
            //Console.WriteLine(message.Title);
            //message.UserID = 1;
            //entity.SubmitChanges();
        }
    }
}
