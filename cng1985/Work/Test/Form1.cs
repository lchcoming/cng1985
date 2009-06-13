using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Work.Test
{
    public partial class Form1 : Form
    {
       
        public Form1( )
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 a = new Form2(this);
            a.ShowDialog();

        }
        public void setada(string name)
        {
            label1.Text=name;
        }
    }
}
