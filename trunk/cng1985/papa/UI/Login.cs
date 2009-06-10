using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace papa.UI
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }
        private object ada;

        public object Ada
        {
            get { return ada; }
            set { ada = value; }
        }
        public Login(ref object c)
        {
            ada = c;
            InitializeComponent();
        }
        private void button1_Click(object sender, EventArgs e)
        {
            ada = new object();
            this.Close();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            ada = null;
            this.Close();
        }
    }
}
