using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace School.SchoolModle
{
    public class SchoolHome
    {
        public SchoolHome()
        {
            _lost = new List<string>();
            _news = new List<string>();
            _notice = new List<string>();
            _work = new List<string>();
        }
        private List<string> _notice;

        public List<string> Notice
        {
            get { return _notice; }
            set { _notice = value; }
        }
        private List<string> _news;

        public List<string> News
        {
            get { return _news; }
            set { _news = value; }
        }
        private List<string> _work;

        public List<string> Work
        {
            get { return _work; }
            set { _work = value; }
        }
        private List<string> _lost;

        public List<string> Lost
        {
            get { return _lost; }
            set { _lost = value; }
        }
    }
}
