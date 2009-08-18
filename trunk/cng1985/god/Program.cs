/*
 * Created by SharpDevelop.
 * User: ada
 * Date: 2009/11/1
 * Time: 15:47
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using god.net;
using System.Threading;
using System.Collections.Generic;
namespace god
{
	class Program
	{
		public static void Main(string[] args)
		{
			Console.WriteLine("Hello World!");
			while(true){
				try{
		    HtmlWork work=new HtmlWork();
		    List<string> u=new List<string>();
		    u.Add("http://cng1985.appspot.com");
		    u.Add("http://cng1985.appspot.com/articles.jsp");
		    u.Add("http://cng1985.appspot.com/search/msg.jsp?url=www.yahoo.com");
		    u.Add("http://cng1985.appspot.com/search/msg.jsp");
			work.visits(u);
			Console.WriteLine("累了，该休息一下了，程序继续运行中！！！！！！！！");
			Thread.Sleep(5000);
				}
				catch(Exception e){
					Console.WriteLine(e.Message);
				}
			}
			Console.Write("Press any key to continue . . . ");
			Console.ReadKey(true);
		}
	}
}