using School.Controllers;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Microsoft.VisualStudio.TestTools.UnitTesting.Web;
using School.LinqModle;
using System.IO;
using System.Text;
using System;
using System.Threading;
using System.Collections.Generic;
namespace School.Tests
{
    
    
    /// <summary>
    ///这是 MessageControllerTest 的测试类，旨在
    ///包含所有 MessageControllerTest 单元测试
    ///</summary>
    [TestClass()]
    public class MessageControllerTest
    {


        private TestContext testContextInstance;

        /// <summary>
        ///获取或设置测试上下文，上下文提供
        ///有关当前测试运行及其功能的信息。
        ///</summary>
        public TestContext TestContext
        {
            get
            {
                return testContextInstance;
            }
            set
            {
                testContextInstance = value;
            }
        }

        #region 附加测试属性
        // 
        //编写测试时，还可使用以下属性:
        //
        //使用 ClassInitialize 在运行类中的第一个测试前先运行代码
        //[ClassInitialize()]
        //public static void MyClassInitialize(TestContext testContext)
        //{
        //}
        //
        //使用 ClassCleanup 在运行完类中的所有测试后再运行代码
        //[ClassCleanup()]
        //public static void MyClassCleanup()
        //{
        //}
        //
        //使用 TestInitialize 在运行每个测试前先运行代码
        //[TestInitialize()]
        //public void MyTestInitialize()
        //{
        //}
        //
        //使用 TestCleanup 在运行完每个测试后运行代码
        //[TestCleanup()]
        //public void MyTestCleanup()
        //{
        //}
        //
        #endregion


        /// <summary>
        ///AddMessage 的测试
        ///</summary>
        // TODO: 确保 UrlToTest 属性指定一个指向 ASP.NET 页的 URL(例如，
        // http://.../Default.aspx)。这对于在 Web 服务器上执行单元测试是必需的，
        //无论要测试页、Web 服务还是 WCF 服务都是如此。
        [TestMethod()]
        [HostType("ASP.NET")]
        [AspNetDevelopmentServerHost("E:\\Source\\cng1985\\School", "/")]
        [UrlToTest("http://localhost:58809/")]
        public void AddMessageTest()
        {
            List<Thread> threds = new List<Thread>();
            for (int sss = 0; sss <150; sss++)
            {
                threds.Add(new Thread(new ThreadStart(delegate {
                    MessageController target = new MessageController(); // TODO: 初始化为适当的值
                    for (int j = 0; j < 2000000; j++)
                    {
                        Message message = new Message();
                        StringBuilder b = new StringBuilder();
                        for (int i = 0; i < 5; i++)
                        {
                            Random generator = new Random((int)DateTime.Now.Ticks);
                            int randomValue;

                            randomValue = generator.Next(19968, 40869);
                            Thread.Sleep(1);
                            char ss = (char)randomValue;
                            b.Append(ss);
                        }
                        message.Title = b.ToString();
                        StringBuilder bu = new StringBuilder();
                        for (int x = 0; x < 200; x++)
                        {
                            Random generator = new Random((int)DateTime.Now.Ticks);
                            int randomValue;

                            randomValue = generator.Next(19968, 40869);
                            Thread.Sleep(1);
                            char ss = (char)randomValue;
                            bu.Append(ss);
                        }
                        message.Message1 = bu.ToString();
                        // TODO: 初始化为适当的值
                        target.AddMessage(message);

                        //Assert.Inconclusive("无法验证不返回值的方法。");
                    }
                
                })));
            }
            foreach (var item in threds)
            {
                item.Start();
            }
            Thread.Sleep(99999999);
        }
    }
}
