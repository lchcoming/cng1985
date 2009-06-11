using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Work.Properties;
using Work.WorkData;
namespace Work.UI
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }
        private int _loginStatus;

        public int LoginStatus
        {
            get { return _loginStatus; }
            set { _loginStatus = value; }
        }
        private string _userName;

        public string UserName
        {
            get { return _userName; }
            set { _userName = value; }
        }
        private string _userPassword;

        public string UserPassword
        {
            get { return _userPassword; }
            set { _userPassword = value; }
        }

        private void Loginbutton_Click(object sender, EventArgs e)
        {
            User user = new User();
            if (user.Login(textBox1.Text, textBox2.Text))
            {

                LoginStatus = 2;
                Properties.Settings.Default.Name = textBox1.Text;
                Properties.Settings.Default.Save();
                this.Close();
            }
            else
            {
                LoginStatus = 3;
                label3.Text = "sds";
            }
            this.Close();
              //  return;
               
        
        }

        private void button2_Click(object sender, EventArgs e)
        {
            LoginStatus = 1;
            this.Close();
        }
    }
}
