/*
 * Created by SharpDevelop.
 * User: ada
 * Date: 2009/11/1
 * Time: 16:02
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.Net;
using System.IO;
using System.Text.RegularExpressions;
namespace god.net
{
	/// <summary>
	/// Description of HtmlWork.
	/// </summary>
	public class HtmlWork
	{
		public HtmlWork()
		{
		}
		public void connect(){
			HttpWebRequest request=(HttpWebRequest)WebRequest.Create("http://cng1985.appspot.com/");
			HttpWebResponse response=(HttpWebResponse)request.GetResponse();
			Stream stream=response.GetResponseStream();
			StreamReader reader=new StreamReader(stream);
			while(reader.Read()!=-1){
				Console.WriteLine(reader.ReadLine());
			}
			Regex r = new Regex("a.*-");
			Match match=r.Match("ada-ada");
			MatchCollection ada=r.Matches("ada-ada-ada adfdsf");
			foreach(var item in ada){
				Console.WriteLine(item);
				Console.WriteLine("**************");
			}
			String content=    reader.ReadToEnd();
			Console.WriteLine(content.Length);
			//StringReader read=new StringReader();
		}
	}
}
