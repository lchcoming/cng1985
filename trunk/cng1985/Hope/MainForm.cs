/*
 * Created by SharpDevelop.
 * User: ada
 * Date: 2009/8/19
 * Time: 18:29
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;
using System.IO;
using System.Net;
using System.Text;
namespace Hope
{
	/// <summary>
	/// Description of MainForm.
	/// </summary>
	public partial class MainForm : Form
	{
		public MainForm()
		{
			//
			// The InitializeComponent() call is required for Windows Forms designer support.
			//
			InitializeComponent();
			
			//
			// TODO: Add constructor code after the InitializeComponent() call.
			//
		}
		
		void Button1Click(object sender, EventArgs e)
		{
			string source="http://cng1985.appspot.com/reader";
			source+="title="+textBox1.Text.Trim();
			source+="&source="+textBox2.Text.Trim();
			
			pub(source);
			MessageBox.Show("success");
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
		public static void pub(String url){
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
		
			String content=    reader.ReadToEnd();
			//Console.WriteLine(content.Length);
			//StringReader read=new StringReader();
		}
	}
}
