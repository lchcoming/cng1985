using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace carwork
{
    public partial class SellForm : Form
    {
        public SellForm()
        {
            InitializeComponent();
            toolStripStatusLabel1.Text = "售票中";
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void SellForm_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'qianlidaDataSet.ts_LineInfo' table. You can move, or remove it, as needed.
            this.ts_LineInfoTableAdapter.Fill(this.qianlidaDataSet.ts_LineInfo);

        }

        private void textBox4_KeyDown(object sender, KeyEventArgs e)
        {
            toolStripStatusLabel1.Text = e.KeyValue.ToString();
            //enter
            if (e.KeyValue == 13)
            {
                listView1.Show();
                listView1.Focus();
            }
            //esc
            if (e.KeyValue == 27)
            {
                listView1.Hide();
            }

        }

        private void listView1_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyValue == 27)
            {
                listView1.Hide();
                textBox4.Focus();

            }
            if (e.KeyValue == 13)
            {
               // listView1.Show();
               // listView1.Focus();
                String v = textBox4.Text.Trim();
                //ts_LineInfoTableAdapter.FillBy1(this.qianlidaDataSet.ts_LineInfo);
                DataClasses1DataContext contex = new DataClasses1DataContext();
                var rst = from c in contex.ts_LineInfos
                          where (c.li_LineID.StartsWith(v))
                          select c;
               // MessageBox.Show(rst.Count().ToString());
                dataGridView1.DataSource = rst;
            }

        }

        private void fillByToolStripButton_Click(object sender, EventArgs e)
        {
            try
            {
                this.ts_LineInfoTableAdapter.FillBy(this.qianlidaDataSet.ts_LineInfo);

            }
            catch (System.Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);

            }

        }
    }
}
