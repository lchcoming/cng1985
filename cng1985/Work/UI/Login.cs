using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Work.UI
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }
        private bool _loginStatus;

        public bool LoginStatus
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
            if (textBox2.Text == "ada")
            {
                LoginStatus = true;
                this.Close();
            }
            else {
                MessageBox.Show("用户密码错误");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            LoginStatus = false;
            this.Close();
        }
    }
}
