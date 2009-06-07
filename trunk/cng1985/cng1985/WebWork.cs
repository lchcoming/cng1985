/*
 * Created by SharpDevelop.
 * User: ada
 * Date: 2009/6/6
 * Time: 16:27
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.Net;
using System.Collections.Generic;
using System.Threading;
namespace cng1985
{
	/// <summary>
	/// Description of WebWork.
	/// </summary>
	public class WebWork
	{
        public event EventHandler Work;
    
		public WebWork()
		{
            _threads = new List<Thread>();
			
		}
		public List<Thread> _threads;
		public void Run()
		{
			foreach(var item  in _threads)
			{
				item.Start();
			}
		}
        public void Test()
        {
            if (Work != null)
            {
                Work(this,new EventArgs());
            }
        }
        //public 
	}
}
