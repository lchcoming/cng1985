namespace carwork
{
    partial class SellForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.Windows.Forms.ListViewItem listViewItem17 = new System.Windows.Forms.ListViewItem("123213");
            System.Windows.Forms.ListViewItem listViewItem18 = new System.Windows.Forms.ListViewItem("12321");
            System.Windows.Forms.ListViewItem listViewItem19 = new System.Windows.Forms.ListViewItem("213213");
            System.Windows.Forms.ListViewItem listViewItem20 = new System.Windows.Forms.ListViewItem("23213");
            System.Windows.Forms.ListViewItem listViewItem21 = new System.Windows.Forms.ListViewItem("23213213");
            System.Windows.Forms.ListViewItem listViewItem22 = new System.Windows.Forms.ListViewItem("213213");
            System.Windows.Forms.ListViewItem listViewItem23 = new System.Windows.Forms.ListViewItem("213213");
            System.Windows.Forms.ListViewItem listViewItem24 = new System.Windows.Forms.ListViewItem("2132132");
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.textBox7 = new System.Windows.Forms.TextBox();
            this.textBox6 = new System.Windows.Forms.TextBox();
            this.textBox5 = new System.Windows.Forms.TextBox();
            this.textBox4 = new System.Windows.Forms.TextBox();
            this.textBox3 = new System.Windows.Forms.TextBox();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.riqi = new System.Windows.Forms.Label();
            this.statusStrip1 = new System.Windows.Forms.StatusStrip();
            this.toolStripStatusLabel1 = new System.Windows.Forms.ToolStripStatusLabel();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.liLineIDDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.liLineNameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.liBeginSiteIDDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.liBeginSiteDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.liEndSiteIDDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.liEndSiteDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.liKilometerDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.liInRegionDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.liDirectionDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.liStopOrOpenDataGridViewCheckBoxColumn = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.liStationIDDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.liStationDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.liRemarkDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.tsLineInfoBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.qianlidaDataSet = new carwork.qianlidaDataSet();
            this.listView1 = new System.Windows.Forms.ListView();
            this.ts_LineInfoTableAdapter = new carwork.qianlidaDataSetTableAdapters.ts_LineInfoTableAdapter();
            this.statusStrip1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tsLineInfoBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.qianlidaDataSet)).BeginInit();
            this.SuspendLayout();
            // 
            // comboBox1
            // 
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Items.AddRange(new object[] {
            "儿童票",
            "军人票"});
            this.comboBox1.Location = new System.Drawing.Point(522, 37);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(44, 20);
            this.comboBox1.TabIndex = 8;
            this.comboBox1.SelectedIndexChanged += new System.EventHandler(this.comboBox1_SelectedIndexChanged);
            // 
            // textBox7
            // 
            this.textBox7.Location = new System.Drawing.Point(589, 38);
            this.textBox7.Name = "textBox7";
            this.textBox7.Size = new System.Drawing.Size(39, 21);
            this.textBox7.TabIndex = 7;
            // 
            // textBox6
            // 
            this.textBox6.Location = new System.Drawing.Point(460, 37);
            this.textBox6.Name = "textBox6";
            this.textBox6.Size = new System.Drawing.Size(39, 21);
            this.textBox6.TabIndex = 7;
            // 
            // textBox5
            // 
            this.textBox5.Location = new System.Drawing.Point(375, 38);
            this.textBox5.Name = "textBox5";
            this.textBox5.Size = new System.Drawing.Size(62, 21);
            this.textBox5.TabIndex = 7;
            // 
            // textBox4
            // 
            this.textBox4.Location = new System.Drawing.Point(282, 37);
            this.textBox4.Name = "textBox4";
            this.textBox4.Size = new System.Drawing.Size(70, 21);
            this.textBox4.TabIndex = 7;
            this.textBox4.KeyDown += new System.Windows.Forms.KeyEventHandler(this.textBox4_KeyDown);
            // 
            // textBox3
            // 
            this.textBox3.Location = new System.Drawing.Point(229, 36);
            this.textBox3.Name = "textBox3";
            this.textBox3.Size = new System.Drawing.Size(30, 21);
            this.textBox3.TabIndex = 7;
            // 
            // textBox2
            // 
            this.textBox2.Location = new System.Drawing.Point(167, 37);
            this.textBox2.Name = "textBox2";
            this.textBox2.Size = new System.Drawing.Size(39, 21);
            this.textBox2.TabIndex = 7;
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(32, 38);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(112, 21);
            this.textBox1.TabIndex = 6;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(587, 22);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(41, 12);
            this.label6.TabIndex = 5;
            this.label6.Text = "打折票";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(456, 22);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(29, 12);
            this.label5.TabIndex = 4;
            this.label5.Text = "半票";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(356, 22);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(29, 12);
            this.label4.TabIndex = 3;
            this.label4.Text = "全票";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(256, 22);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(29, 12);
            this.label3.TabIndex = 2;
            this.label3.Text = "到站";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(165, 22);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(41, 12);
            this.label2.TabIndex = 1;
            this.label2.Text = "出发站";
            // 
            // riqi
            // 
            this.riqi.AutoSize = true;
            this.riqi.Location = new System.Drawing.Point(30, 22);
            this.riqi.Name = "riqi";
            this.riqi.Size = new System.Drawing.Size(29, 12);
            this.riqi.TabIndex = 0;
            this.riqi.Text = "日期";
            // 
            // statusStrip1
            // 
            this.statusStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripStatusLabel1});
            this.statusStrip1.Location = new System.Drawing.Point(0, 596);
            this.statusStrip1.Name = "statusStrip1";
            this.statusStrip1.Size = new System.Drawing.Size(1027, 22);
            this.statusStrip1.TabIndex = 1;
            this.statusStrip1.Text = "statusStrip1";
            // 
            // toolStripStatusLabel1
            // 
            this.toolStripStatusLabel1.Name = "toolStripStatusLabel1";
            this.toolStripStatusLabel1.Size = new System.Drawing.Size(131, 17);
            this.toolStripStatusLabel1.Text = "toolStripStatusLabel1";
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.liLineIDDataGridViewTextBoxColumn,
            this.liLineNameDataGridViewTextBoxColumn,
            this.liBeginSiteIDDataGridViewTextBoxColumn,
            this.liBeginSiteDataGridViewTextBoxColumn,
            this.liEndSiteIDDataGridViewTextBoxColumn,
            this.liEndSiteDataGridViewTextBoxColumn,
            this.liKilometerDataGridViewTextBoxColumn,
            this.liInRegionDataGridViewTextBoxColumn,
            this.liDirectionDataGridViewTextBoxColumn,
            this.liStopOrOpenDataGridViewCheckBoxColumn,
            this.liStationIDDataGridViewTextBoxColumn,
            this.liStationDataGridViewTextBoxColumn,
            this.liRemarkDataGridViewTextBoxColumn});
            this.dataGridView1.DataSource = this.tsLineInfoBindingSource;
            this.dataGridView1.Location = new System.Drawing.Point(0, 226);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 23;
            this.dataGridView1.Size = new System.Drawing.Size(1007, 350);
            this.dataGridView1.TabIndex = 2;
            // 
            // liLineIDDataGridViewTextBoxColumn
            // 
            this.liLineIDDataGridViewTextBoxColumn.DataPropertyName = "li_LineID";
            this.liLineIDDataGridViewTextBoxColumn.HeaderText = "li_LineID";
            this.liLineIDDataGridViewTextBoxColumn.Name = "liLineIDDataGridViewTextBoxColumn";
            // 
            // liLineNameDataGridViewTextBoxColumn
            // 
            this.liLineNameDataGridViewTextBoxColumn.DataPropertyName = "li_LineName";
            this.liLineNameDataGridViewTextBoxColumn.HeaderText = "li_LineName";
            this.liLineNameDataGridViewTextBoxColumn.Name = "liLineNameDataGridViewTextBoxColumn";
            // 
            // liBeginSiteIDDataGridViewTextBoxColumn
            // 
            this.liBeginSiteIDDataGridViewTextBoxColumn.DataPropertyName = "li_BeginSiteID";
            this.liBeginSiteIDDataGridViewTextBoxColumn.HeaderText = "li_BeginSiteID";
            this.liBeginSiteIDDataGridViewTextBoxColumn.Name = "liBeginSiteIDDataGridViewTextBoxColumn";
            // 
            // liBeginSiteDataGridViewTextBoxColumn
            // 
            this.liBeginSiteDataGridViewTextBoxColumn.DataPropertyName = "li_BeginSite";
            this.liBeginSiteDataGridViewTextBoxColumn.HeaderText = "li_BeginSite";
            this.liBeginSiteDataGridViewTextBoxColumn.Name = "liBeginSiteDataGridViewTextBoxColumn";
            // 
            // liEndSiteIDDataGridViewTextBoxColumn
            // 
            this.liEndSiteIDDataGridViewTextBoxColumn.DataPropertyName = "li_EndSiteID";
            this.liEndSiteIDDataGridViewTextBoxColumn.HeaderText = "li_EndSiteID";
            this.liEndSiteIDDataGridViewTextBoxColumn.Name = "liEndSiteIDDataGridViewTextBoxColumn";
            // 
            // liEndSiteDataGridViewTextBoxColumn
            // 
            this.liEndSiteDataGridViewTextBoxColumn.DataPropertyName = "li_EndSite";
            this.liEndSiteDataGridViewTextBoxColumn.HeaderText = "li_EndSite";
            this.liEndSiteDataGridViewTextBoxColumn.Name = "liEndSiteDataGridViewTextBoxColumn";
            // 
            // liKilometerDataGridViewTextBoxColumn
            // 
            this.liKilometerDataGridViewTextBoxColumn.DataPropertyName = "li_Kilometer";
            this.liKilometerDataGridViewTextBoxColumn.HeaderText = "li_Kilometer";
            this.liKilometerDataGridViewTextBoxColumn.Name = "liKilometerDataGridViewTextBoxColumn";
            // 
            // liInRegionDataGridViewTextBoxColumn
            // 
            this.liInRegionDataGridViewTextBoxColumn.DataPropertyName = "li_InRegion";
            this.liInRegionDataGridViewTextBoxColumn.HeaderText = "li_InRegion";
            this.liInRegionDataGridViewTextBoxColumn.Name = "liInRegionDataGridViewTextBoxColumn";
            // 
            // liDirectionDataGridViewTextBoxColumn
            // 
            this.liDirectionDataGridViewTextBoxColumn.DataPropertyName = "li_Direction";
            this.liDirectionDataGridViewTextBoxColumn.HeaderText = "li_Direction";
            this.liDirectionDataGridViewTextBoxColumn.Name = "liDirectionDataGridViewTextBoxColumn";
            // 
            // liStopOrOpenDataGridViewCheckBoxColumn
            // 
            this.liStopOrOpenDataGridViewCheckBoxColumn.DataPropertyName = "li_StopOrOpen";
            this.liStopOrOpenDataGridViewCheckBoxColumn.HeaderText = "li_StopOrOpen";
            this.liStopOrOpenDataGridViewCheckBoxColumn.Name = "liStopOrOpenDataGridViewCheckBoxColumn";
            // 
            // liStationIDDataGridViewTextBoxColumn
            // 
            this.liStationIDDataGridViewTextBoxColumn.DataPropertyName = "li_StationID";
            this.liStationIDDataGridViewTextBoxColumn.HeaderText = "li_StationID";
            this.liStationIDDataGridViewTextBoxColumn.Name = "liStationIDDataGridViewTextBoxColumn";
            // 
            // liStationDataGridViewTextBoxColumn
            // 
            this.liStationDataGridViewTextBoxColumn.DataPropertyName = "li_Station";
            this.liStationDataGridViewTextBoxColumn.HeaderText = "li_Station";
            this.liStationDataGridViewTextBoxColumn.Name = "liStationDataGridViewTextBoxColumn";
            // 
            // liRemarkDataGridViewTextBoxColumn
            // 
            this.liRemarkDataGridViewTextBoxColumn.DataPropertyName = "li_Remark";
            this.liRemarkDataGridViewTextBoxColumn.HeaderText = "li_Remark";
            this.liRemarkDataGridViewTextBoxColumn.Name = "liRemarkDataGridViewTextBoxColumn";
            // 
            // tsLineInfoBindingSource
            // 
            this.tsLineInfoBindingSource.DataMember = "ts_LineInfo";
            this.tsLineInfoBindingSource.DataSource = this.qianlidaDataSet;
            // 
            // qianlidaDataSet
            // 
            this.qianlidaDataSet.DataSetName = "qianlidaDataSet";
            this.qianlidaDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // listView1
            // 
            this.listView1.Items.AddRange(new System.Windows.Forms.ListViewItem[] {
            listViewItem17,
            listViewItem18,
            listViewItem19,
            listViewItem20,
            listViewItem21,
            listViewItem22,
            listViewItem23,
            listViewItem24});
            this.listView1.Location = new System.Drawing.Point(282, 64);
            this.listView1.Name = "listView1";
            this.listView1.Size = new System.Drawing.Size(49, 183);
            this.listView1.TabIndex = 9;
            this.listView1.UseCompatibleStateImageBehavior = false;
            this.listView1.View = System.Windows.Forms.View.List;
            this.listView1.Visible = false;
            this.listView1.KeyDown += new System.Windows.Forms.KeyEventHandler(this.listView1_KeyDown);
            // 
            // ts_LineInfoTableAdapter
            // 
            this.ts_LineInfoTableAdapter.ClearBeforeFill = true;
            // 
            // SellForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1027, 618);
            this.Controls.Add(this.listView1);
            this.Controls.Add(this.comboBox1);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.textBox7);
            this.Controls.Add(this.statusStrip1);
            this.Controls.Add(this.textBox6);
            this.Controls.Add(this.textBox5);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.textBox4);
            this.Controls.Add(this.riqi);
            this.Controls.Add(this.textBox3);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.textBox2);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label6);
            this.Name = "SellForm";
            this.Text = "SellForm";
            this.Load += new System.EventHandler(this.SellForm_Load);
            this.statusStrip1.ResumeLayout(false);
            this.statusStrip1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tsLineInfoBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.qianlidaDataSet)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.StatusStrip statusStrip1;
        private System.Windows.Forms.ToolStripStatusLabel toolStripStatusLabel1;
        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.TextBox textBox7;
        private System.Windows.Forms.TextBox textBox6;
        private System.Windows.Forms.TextBox textBox5;
        private System.Windows.Forms.TextBox textBox4;
        private System.Windows.Forms.TextBox textBox3;
        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label riqi;
        private System.Windows.Forms.ListView listView1;
        private System.Windows.Forms.DataGridView dataGridView1;
        private qianlidaDataSet qianlidaDataSet;
        private System.Windows.Forms.BindingSource tsLineInfoBindingSource;
        private qianlidaDataSetTableAdapters.ts_LineInfoTableAdapter ts_LineInfoTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn liLineIDDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn liLineNameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn liBeginSiteIDDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn liBeginSiteDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn liEndSiteIDDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn liEndSiteDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn liKilometerDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn liInRegionDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn liDirectionDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewCheckBoxColumn liStopOrOpenDataGridViewCheckBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn liStationIDDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn liStationDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn liRemarkDataGridViewTextBoxColumn;
    }
}