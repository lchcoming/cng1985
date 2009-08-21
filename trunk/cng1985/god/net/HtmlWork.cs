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
		public void pub(String url){
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
		public static string GetPage(string url, string postData,string encodeType,out string err)
		{
			Stream outstream = null;
			Stream instream = null;
			StreamReader sr = null;
			HttpWebResponse response = null;
			HttpWebRequest request = null;
			Encoding encoding = Encoding.GetEncoding(encodeType);
			byte[] data = encoding.GetBytes(postData);
			// 准备请求...
			try
			{
				// 设置参数
				request = WebRequest.Create(url) as HttpWebRequest;
				CookieContainer cookieContainer = new CookieContainer();
				request.CookieContainer = cookieContainer;
				request.AllowAutoRedirect = true;
				request.Method = "POST";
				request.ContentType = "application/x-www-form-urlencoded";
				request.ContentLength = data.Length;
				outstream = request.GetRequestStream();
				outstream.Write(data,0,data.Length);
				outstream.Close();
				//发送请求并获取相应回应数据
				response = request.GetResponse() as HttpWebResponse;
				//直到request.GetResponse()程序才开始向目标网页发送Post请求
				instream = response.GetResponseStream();
				sr = new StreamReader( instream, encoding );
				//返回结果网页（html）代码
				string content = sr.ReadToEnd();
				err = string.Empty;
				return content;
			}
			catch(Exception ex)
			{
				err = ex.Message;
				return string.Empty;
			}
		}
	
	
	}
}
