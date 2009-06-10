using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using papa.UI;
namespace papa
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            object c = null;
            Login login = new Login(ref c);
            login.ShowDialog();
            if(login.Ada==null)
            {
            this.Close();
            }
            else{
            
            }

        }
    }
}
