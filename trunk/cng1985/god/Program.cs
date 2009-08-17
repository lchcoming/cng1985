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
namespace god
{
	class Program
	{
		public static void Main(string[] args)
		{
			Console.WriteLine("Hello World!");
			while(true){
		    HtmlWork work=new HtmlWork();
			string[] urls=new string[]{"http://cng1985.appspot.com","http://cng1985.appspot.com/articles.jsp"};
			work.visits(urls);
			Thread.Sleep(5000);
			Console.WriteLine("+++++++++++++++++++++++");
			}
			Console.Write("Press any key to continue . . . ");
			Console.ReadKey(true);
		}
	}
}