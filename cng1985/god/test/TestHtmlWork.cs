/*
 * Created by SharpDevelop.
 * User: ada
 * Date: 2009/11/1
 * Time: 16:07
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using god.net;
using NUnit.Framework;
namespace god.test
{
	/// <summary>
	/// Description of TestHtmlWork.
	/// </summary>
	/// 
	[TestFixture]
	public class TestHtmlWork
	{
		
		public TestHtmlWork()
		{
 
		}
		[Test]
	   public void	TestConnect(){
			HtmlWork work=new HtmlWork();
			//string[] urls=new string[]{"http://cng1985.appspot.com","http://cng1985.appspot.com/articles.jsp"};
			
			work.pub(@"http://cng1985.appspot.com/reader?source=≤‚ ‘&subject=ƒ„∫√");
		}
		
	}
}
