package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import UI.Base.GradientButton2;

import entitry.Login;

public class SingleLoginDialog extends JFrame {

	private Login loginModel;
	private MainFrame mainFrame;
	private int dlgWidth = 270;
	private int dlgHeight = 220;
	private int parentStatue;
	private JButton btnUser;
	private JButton btnPassword;
	private JButton btnURL;
	private JTextField tfText;
	private JLabel lblText;
	
	public SingleLoginDialog(MainFrame mf,Login lm)
	{
		super();
		this.mainFrame = mf;
		this.loginModel = lm;
		int dlgX = 0;
		int dlgY = 0;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		if(screen.width > dlgWidth)
			dlgX = (screen.width - dlgWidth)/2;
		if(screen.height > dlgWidth)
			dlgY = (screen.height - dlgWidth)/2;
		this.setBounds(dlgX, dlgY, dlgWidth, dlgHeight);
		this.setTitle("记录项-" + lm.getLoginName());
		this.setAlwaysOnTop(true);
		init();
		this.addWindowListener(new WindowAdapter(){
			public void windowOpened(WindowEvent e)
			{
				onLoad();
			}
			public void windowClosing(WindowEvent e)
			{
				onClose();
			}
		});
		this.pack();
	}
	
	public void init()
	{
		btnUser = new GradientButton2("用户名");
		btnUser.setPreferredSize(new Dimension(70,25));
		btnPassword = new GradientButton2("密码");
		btnPassword.setPreferredSize(new Dimension(70,25));
		btnURL = new GradientButton2("网址");
		btnURL.setPreferredSize(new Dimension(70,25));
		tfText = new JTextField();
		tfText.setVisible(false);
		
		JPanel panelButton = new JPanel();
		panelButton.setPreferredSize(new Dimension(getWidth(),30));
		panelButton.add(btnUser);
		panelButton.add(btnPassword);
		panelButton.add(btnURL);
		panelButton.add(tfText);
		this.add(panelButton,BorderLayout.CENTER);
		lblText = new JLabel("点击相应按钮将记录复制到剪贴板");
		lblText.setBackground(new Color(100,200,200));
		lblText.setOpaque(true);
		lblText.setHorizontalAlignment(SwingConstants.CENTER);
		lblText.setPreferredSize(new Dimension(this.getWidth(),20));
		lblText.setBackground(new Color(0xffffff));
		this.add(lblText,BorderLayout.SOUTH);
		btnUser.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfText.setText(loginModel.getLoginUser());
				tfText.selectAll();
				tfText.copy();
				lblText.setText("\"用户\"已复制到剪贴板！");
			}
		});
		btnPassword.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfText.setText(loginModel.getLoginPassword());
				tfText.selectAll();
				tfText.copy();
				lblText.setText("\"密码\"已复制到剪贴板！");
			}
		});
		btnURL.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfText.setText(loginModel.getLoginURL());
				tfText.selectAll();
				tfText.copy();
				lblText.setText("\"网址\"已复制到剪贴板！");
			}
		});
	}
	
	public void onClose()
	{
		this.mainFrame.setExtendedState(parentStatue);
		this.dispose();
	}
	public void onLoad()
	{
		parentStatue = this.mainFrame.getExtendedState();
		this.mainFrame.setExtendedState(JFrame.HIDE_ON_CLOSE);
	}
}
