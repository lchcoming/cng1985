package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import entitry.Login;

import UI.Base.BasePanel;
import UI.Base.GradientButton;
import UI.Base.GradientButton2;
import UI.Base.MyTableCellRender;

import DataManager.LoginManager;

public class RightPanel extends BasePanel {

	private JTable table;
	RountTextField txtFind;
	
	public RightPanel(LoginManager loginManager,MainPanel mainPanel)
	{
		super();
		this.loginManager = loginManager;
		this.mainPanel = mainPanel;
		initUI();
	}
	
	public void initUI()
	{
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout());
		initFindPanel(contentPanel);
		initTable(contentPanel);
		this.add(contentPanel,BorderLayout.CENTER);
		initBottomPanel();
	}
	
	private void initFindPanel(JPanel panel)
	{
		JPanel findPanel = new JPanel();
		findPanel.setMaximumSize(new Dimension(getWidth(),30));
		findPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lab = new JLabel("����¼������");
		txtFind = new RountTextField();
		txtFind.setPreferredSize(new Dimension(250,25));
		GradientButton2 btnFind = new GradientButton2("����(F)");
		btnFind.setPreferredSize(new Dimension(80,25));
		btnFind.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				loginManager.find(txtFind.getText());
			}
		});
		findPanel.add(lab);
		findPanel.add(txtFind);
		findPanel.add(btnFind);
		panel.add(findPanel,BorderLayout.NORTH);
	}
	
	private void initTable(JPanel panel)
	{
		table = new JTable(loginManager.dtm);
		loginManager.dtm.addColumn("");
		loginManager.dtm.addColumn("��¼����");
		loginManager.dtm.addColumn("�û���");
		loginManager.dtm.addColumn("����");
		loginManager.dtm.addColumn("��ַ");
		table.setShowVerticalLines(false);
		table.setGridColor(new Color(200, 200, 200));
		String fontName = loginManager.configManager.getFontName();
		int fontSize = loginManager.configManager.getFontSize();
		SetupTableFont(fontName,fontSize);
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane,BorderLayout.CENTER);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				updateTextFields();
			}
			
		});
		table.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e)
			{
//				updateTextFields();
				if(e.getClickCount()>=2)
				{
					//�����˫������ĳһ���򵯳�һ���Ի���
					onSingleLoginDlg();
				}
			}
		});
		table.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					updateTextFields();
			}
		});
	}
	
	public void SetupTableFont(String fontName,int fontSize)
	{
		Font font = new Font(fontName,Font.PLAIN,fontSize);
		Font fontBold = new Font(fontName,Font.BOLD,fontSize);
		setTableColumn("",30,false,font);
		setTableColumn("��¼����",200,true,fontBold);
		setTableColumn("�û���",100,true,font);
		setTableColumn("����",100,true,font);
		setTableColumn("��ַ",100,true,font);
		table.setRowHeight(font.getSize()+15);
	}
	
	//���ñ����ÿһ�е���ʾ���ԣ�����titleָ��Ҫ���õ�����
	private void setTableColumn(String title,int width,boolean isResizable,Font font)
	{
		if(!isResizable)//��������ǲ��ܸı��п�Ļ�����п�����ֵ����Сֵ��Ϊһ��
		{
			table.getColumn(title).setMaxWidth(width);
			table.getColumn(title).setMinWidth(width);
		}
		table.getColumn(title).setPreferredWidth(width);
		table.getColumn(title).setResizable(isResizable);
		table.getColumn(title).setCellRenderer(new MyTableCellRender(font));
	}

	//���ڳ��ֱ��������Ч������
//	private void addData()
//	{
//		Vector data = new Vector();
//		data.add("aaa");
//		data.add("���庺��");
//		data.add("������ʽ");
//		data.add("aaa");
//		data.add("aaa");
//		loginManager.dtm.addRow(data);
//		loginManager.dtm.addRow(data);
//		loginManager.dtm.addRow(data);
//		loginManager.dtm.addRow(data);
//		loginManager.dtm.addRow(data);
//	}
	
	private void initBottomPanel()
	{
		this.add(mainPanel.bottomPanel = new BottomPanel(loginManager,this.mainPanel),BorderLayout.SOUTH);
		mainPanel.bottomPanel.updateButton();
	}
	
	public int getTableSelectItem()
	{
		return table.getSelectedRow();
	}
	
	//���ݱ���е�ѡ�����¼��Ϣ���Ӧ�ĵײ��ı�����
	public void updateTextFields()
	{
		int row = table.getSelectedRow();
		if(row >= 0)
		{
			int loginId = Integer.parseInt(table.getValueAt(row, 0).toString());
			loginManager.selectLogin = loginManager.get(loginId);
			
			mainPanel.bottomPanel.tfLogin.setText(loginManager.selectLogin.getLoginName());
			mainPanel.bottomPanel.tfUser.setText(loginManager.selectLogin.getLoginUser());
			mainPanel.bottomPanel.tfPassword.setText(loginManager.selectLogin.getLoginPassword());
			mainPanel.bottomPanel.tfURL.setText(loginManager.selectLogin.getLoginURL());
			mainPanel.bottomPanel.updateButton();
		}
	}
	
	//����һ������м�¼�ĶԻ���
	public void onSingleLoginDlg()
	{
		if(loginManager.selectLogin != null)
		{
			SingleLoginDialog sld = new SingleLoginDialog(this.mainPanel.mainFrame,loginManager.selectLogin);
			sld.setResizable(false);
			sld.setVisible(true);
		}
	}
}
