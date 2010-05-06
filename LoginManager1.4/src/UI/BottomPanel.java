package UI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import entitry.ListItemData;
import entitry.Login;

import UI.Base.BasePanel;
import UI.Base.GradientButton2;

import DataManager.LoginManager;

public class BottomPanel extends BasePanel {

	private RightPanel rightPanel;
	private JButton btnAdd;
	private JButton btnDel;
	private JButton btnModify;
	private JButton btnReset;
	private JButton btnGo;
	public JTextField tfLogin;
	public JTextField tfUser;
	public JTextField tfPassword;
	public JTextField tfURL;
	private LoginManager loginManager;
	private int whichTextBox = -1;
	
	public BottomPanel(LoginManager loginManager,MainPanel mainPanel)
	{
		super();
		this.loginManager = loginManager;
		this.mainPanel = mainPanel;
		this.setPreferredSize(new Dimension(getWidth(),180));
		this.setTitle("��¼��Ϣ","image/icoLogin.gif");
		initInputArea();
		initBtnArea();
	}
	
	public void initInputArea()
	{
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(new Color(0xffffff));
		panel.setPreferredSize(new Dimension(getWidth(),130));
		panel.setBorder(new EmptyBorder(5,0,getWidth()+5,getHeight()+5));
		panel.setLayout(new GridLayout(4,1,4,4));
		this.add(panel);
		addInput(panel,"��¼����",tfLogin = new RountTextField());
		addInput(panel,"�û�����",tfUser = new RountTextField());
		addInput(panel,"�ܡ��룺",tfPassword = new RountTextField());
		addInput(panel,"����ַ��",tfURL = new RountTextField(),btnGo = new GradientButton2("Go"));
		tfLogin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				whichTextBox = 1;
			}
		});
		tfUser.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				whichTextBox = 2;
			}
		});
		tfPassword.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				whichTextBox = 3;
			}
		});
		tfURL.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				whichTextBox = 4;
			}
		});
	}
	
	//��һ���ı���ǩ��һ���ı���������岢����
	public void addInput(JPanel panel,String txt,JTextField tf)
	{
		JPanel p = new JPanel();
		p.setBackground(new Color(0xffffff));
		p.setOpaque(true);
		p.setLayout(new BorderLayout(4,4));
		JLabel lab = new JLabel(txt,SwingConstants.CENTER);
		lab.setPreferredSize(new Dimension(75,22));
		p.add(lab,BorderLayout.WEST);
		p.add(tf);
		panel.add(p);
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				updateButton();
			}
		});
		tf.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				updateButton();
			}

			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				updateButton();
			}
		});
		tf.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON3) {
					mainPanel.popMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
	}
	
	public void editMenuCopy() {
		switch (whichTextBox) {
		case 1:
			tfLogin.copy();
			break;
		case 2:
			tfUser.copy();
			break;
		case 3:
			tfPassword.copy();
			break;
		case 4:
			tfURL.copy();
			break;
		default:
			return;
		}
	}

	public void editMenuCut() {
		switch (whichTextBox) {
		case 1:
			tfLogin.cut();
			break;
		case 2:
			tfUser.cut();
			break;
		case 3:
			tfPassword.cut();
			break;
		case 4:
			tfURL.cut();
			break;
		default:
			return;
		}
	}

	public void editMenuPaste() {
		switch (whichTextBox) {
		case 1:
			tfLogin.paste();
			break;
		case 2:
			tfUser.paste();
			break;
		case 3:
			tfPassword.paste();
			break;
		case 4:
			tfURL.paste();
			break;
		default:
			return;
		}
	}
	
	public void addInput(JPanel panel,String txt,JTextField tf,JButton btn)
	{
		JPanel p = new JPanel();
		p.setBackground(new Color(0xffffff));
		p.setOpaque(true);
		p.setLayout(new BorderLayout(4,4));
		JLabel lab = new JLabel(txt,SwingConstants.CENTER);
		lab.setPreferredSize(new Dimension(75,22));
		p.add(lab,BorderLayout.WEST);
		p.add(tf);
		btn.setPreferredSize(new Dimension(50,22));
		p.add(btn,BorderLayout.EAST);
		panel.add(p);
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				updateButton();
			}
		});
		tf.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				updateButton();
			}

			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				updateButton();
			}
		});
		tf.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON3) {
					mainPanel.popMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
	}
	
	public void initBtnArea()
	{
		JPanel panel = new JPanel();
		panel.setOpaque(true);
		panel.setBackground(new Color(0xffffff));
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(panel,BorderLayout.SOUTH);
		btnAdd = new GradientButton2("������¼");
		btnDel = new GradientButton2("ɾ����¼");
		btnModify = new GradientButton2("�޸ļ�¼");
		btnReset = new GradientButton2("��������");
		btnAdd.setPreferredSize(new Dimension(100,30));
		btnDel.setPreferredSize(new Dimension(100,30));
		btnModify.setPreferredSize(new Dimension(100,30));
		btnReset.setPreferredSize(new Dimension(100,30));
		panel.add(btnAdd);
		panel.add(btnDel);
		panel.add(btnModify);
		panel.add(btnReset);
		btnAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				addLogin();
			}
		});
		btnModify.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				modifyLogin();
			}
		});
		btnDel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				deleteLogin();
			}
		});
		btnReset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				resetInput();
			}
		});
		btnGo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				goUrl();
			}
		});
	}
	
	public void addLogin()
	{
		Login login = new Login();
		login.setLoginName(tfLogin.getText());
		login.setLoginPassword(tfPassword.getText());
		login.setLoginUser(tfUser.getText());
		login.setLoginURL(tfURL.getText());
		if(loginManager.getCurrType()!=null)
		{
			boolean res = loginManager.addLogin(login);
			mainPanel.setStatusText(loginManager.getMessageText(), res);
			//����addLogin�����ķ���ֵ�жϣ����Ϊfalseֵ�����Ի��򱨴��������������ı�
			if(!res)
				JOptionPane.showMessageDialog(null, loginManager.getMessageText(),"����", JOptionPane.ERROR_MESSAGE);
			else
			{
				resetInput();
				//�����������һ����¼������б���ѡ����Ϊ-1����û���κ��ѡ��
				//�Ժ��ó���ķ�ʽ����ʹ����б���ѡ����
				mainPanel.leftPanel.setListSelectItem(mainPanel.leftPanel.getSelectIndex());
			}
			this.updateButton();
		}
	}
	
	public void modifyLogin()
	{
		Login lm = new Login();
		lm.setLoginName(tfLogin.getText());
		lm.setLoginUser(tfUser.getText());
		lm.setLoginPassword(tfPassword.getText());
		lm.setLoginURL(tfURL.getText());
		boolean res = loginManager.modifyLogin(lm);
		mainPanel.setStatusText(loginManager.getMessageText(), res);
		if(!res)	
			JOptionPane.showMessageDialog(null, loginManager.getMessageText(),"����", JOptionPane.ERROR_MESSAGE);
		else
			mainPanel.leftPanel.setListSelectItem(mainPanel.leftPanel.getSelectIndex());
		this.updateButton();
	}
	
	public void deleteLogin()
	{
		int res = JOptionPane.showConfirmDialog(null, "ȷ��Ҫɾ��������¼��","ɾ��ȷ��",JOptionPane.YES_NO_OPTION);
		if(res == JOptionPane.YES_OPTION)
		{
			loginManager.deleteLogin();
			mainPanel.setStatusText(loginManager.getMessageText(), true);
			resetInput();
			this.updateButton();
		}
	}
	
	public void resetInput()
	{
		tfLogin.setText("");
		tfUser.setText("");
		tfPassword.setText("");
		tfURL.setText("");
		tfLogin.setFocusable(true);
	}
	
	public void goUrl()
	{
		String WIN_PATH = "rundll32";
        String WIN_FLAG = "url.dll,FileProtocolHandler";
        String cmd = null;

        try{
             // cmd = 'rundll32 url.dll,FileProtocolHandler [url]http://...[/url]'
              cmd = WIN_PATH + " " + WIN_FLAG + " " + tfURL.getText();
              Process p = Runtime.getRuntime().exec(cmd);
        } catch(IOException x){
             // �������������
              System.err.println("���ܵ��������, command = " + cmd);
              System.err.println("�쳣: " + x);
              JOptionPane.showMessageDialog(null, x, "���ܵ��������", JOptionPane.ERROR_MESSAGE);
        }
	}
	
	public void updateButton()
	{
		btnAdd.setEnabled(true);
		btnModify.setEnabled(true);
		btnDel.setEnabled(true);
		if(tfLogin.getText().equals("")||tfUser.getText().equals("")||tfPassword.getText().equals(""))
		{
			btnAdd.setEnabled(false);
			btnModify.setEnabled(false);
		}
		if(mainPanel.rightPanel==null||mainPanel.rightPanel.getTableSelectItem() < 0)
		{
			btnModify.setEnabled(false);
			btnDel.setEnabled(false);
		}
		if(tfURL.getText().equals(""))
			btnGo.setEnabled(false);
		else
			btnGo.setEnabled(true);
		mainPanel.updateTitle();
	}
	
}
