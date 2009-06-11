using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Work.UI;
namespace Work
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }
        private Login login;

        private void MainForm_Load(object sender, EventArgs e)
        {
            login = new Login();
            login.ShowDialog();
            if (!login.LoginStatus)
            {
                this.Close();
            }
            
        }
    }
}
