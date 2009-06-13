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
    public partial class Form2 : Form
    {
        private Form1 a;
        public Form2(Form1 ada)
        {
            a = ada;
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            a.setada(textBox1.Text);
        }
    }
}
