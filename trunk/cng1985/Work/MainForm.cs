// one line to give the program's name and an idea of what it does.
// Copyright (C) yyyy  name of author
// 
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2
// of the License, or (at your option) any later version.
// 
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Work.UI;
using Work.WorkResource;
namespace Work
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            NewMethod();
            InitializeComponent();
        }
        private Login login;

        private void MainForm_Load(object sender, EventArgs e)
        {
            
            
        }

        private void NewMethod()
        {
            login = new Login();
            login.LoginStatus = 3;

            while (login.LoginStatus == 3)
            {
                login.ShowDialog();
                if (login.LoginStatus == 2)
                {
                    break;
                }
            }
            if (login.LoginStatus == 1)
            {
                this.Close();
            }
            this.Text = Work.Properties.Settings.Default.Name;
        }

        private void 关于AToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AboutBox about = new AboutBox();
            about.ShowDialog(this);
        }
    }
}
