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
using System.Collections.Generic;
namespace god.net
{
	/// <summary>
	/// Description of HtmlWork.
	/// </summary>
	public class HtmlWork
	{
		public static long visit=1;
		public HtmlWork()
		{
		}
		public void connect(String url){
			HttpWebRequest request=(HttpWebRequest)WebRequest.Create(url);
			HttpWebResponse response=(HttpWebResponse)request.GetResponse();
			Stream stream=response.GetResponseStream();
			StreamReader reader=new StreamReader(stream);
			int i=1;
			while(reader.ReadLine()!=null){
				if(i%300==0){
				//Console.WriteLine(i);
				}
				i++;
			}
			Regex r = new Regex("a.*-");
			Match match=r.Match("ada-ada");
			MatchCollection ada=r.Matches("ada-ada-ada adfdsf");
			foreach(var item in ada){
				//Console.WriteLine(item);
				//Console.WriteLine("**************");
			}
			String content=    reader.ReadToEnd();
			Console.WriteLine(content.Length);
			//StringReader read=new StringReader();
		}
		public void visits(List<String> urls){
			foreach(string item in urls){
				connect(item);
				
			}
			visit++;
			Console.Clear();
			Console.WriteLine("visit:{0}",visit);
		}
	
	}
}
