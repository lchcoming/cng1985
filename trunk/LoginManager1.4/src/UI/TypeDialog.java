package UI;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import entitry.ListItemData;

import DataManager.LoginManager;
import UI.Base.GradientButton2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class TypeDialog extends JDialog {

	private int dlgWidth = 330;
	private int dlgHeight = 140;
	private LoginManager loginManager;
	private MainFrame mainFrame;
	private MainPanel mainPanel;
	private JTextField tfName = new RountTextField();
	private JLabel labIcon = new JLabel();
	private JButton btnBrower = new GradientButton2("...");
	private JCheckBox jcb = new JCheckBox("使用外部图标");
	
	public TypeDialog(MainFrame mainFrame, MainPanel mainPanel,LoginManager loginManager, boolean isAddType)
	{
		super();
		this.mainFrame = mainFrame;
		this.mainPanel = mainPanel;
		this.loginManager = loginManager;
		String title = isAddType ? "新增记录类型" : "修改记录类型";
		this.setTitle(title);
		int dlgx = (mainFrame.getWidth() - dlgWidth) / 2 + mainFrame.getX();
		int dlgy = (mainFrame.getHeight() - dlgHeight) / 2 + mainFrame.getY();
		this.setBounds(dlgx, dlgy, dlgWidth, dlgHeight);
		init(isAddType);
	}
	
	public void init(boolean isAddType)
	{
		this.setLayout(null);
		JLabel labName = new JLabel("记录名：");
		labName.setBounds(10, 10, 60, 20);
		this.add(labName);
		tfName.setBounds(65, 10, 240, 20);
		tfName.setText("新记录分类");
		this.add(tfName);
		jcb.setBounds(10, 40, 110, 20);
		jcb.setFont(new Font("宋体",Font.PLAIN,12));
		jcb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				updateUI();
			}
		});
		this.add(jcb);
		labIcon.setBounds(120, 40, 150, 20);
		labIcon.setBorder(new LineBorder(new Color(0xc0c0c0)));
		this.add(labIcon);
		
		btnBrower.setBounds(275, 40, 30, 20);
		btnBrower.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				getIconUrl();
			}
		});
		this.add(btnBrower);
		
		JButton btnOk = new GradientButton2();
		if(isAddType)
			btnOk.setText("确定");
		else
		{
			ListItemData item = (ListItemData)mainPanel.leftPanel.getSelectItem();
			btnOk.setText("修改");
			tfName.setText(item.getTxtTitle());
			jcb.setSelected(item.isCustomIcon());
			labIcon.setText(item.getIconURL());
		}
		btnOk.setBounds(100, 70, 60, 25);
		btnOk.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(e.getActionCommand().equals("确定"))
					addType();
				if(e.getActionCommand().equals("修改"))
					modifyType();
			}
		});
		this.add(btnOk);
		JButton btnCancel = new GradientButton2("取消");
		btnCancel.setBounds(165, 70, 60, 25);
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				onCancel();
			}
		});
		this.add(btnCancel);
		
		updateUI();
	}
	
	public void updateUI()
	{
		if(jcb.isSelected())
		{
			btnBrower.setEnabled(true);
		}
		else
		{
			btnBrower.setEnabled(false);
			labIcon.setText("");
		}
	}
	
	public void addType()
	{
		String iconUrl;
		if(jcb.isSelected())
		{
			iconUrl = labIcon.getText();
		}
		else
		{
			iconUrl = "image/defaultIcon.png";
		}
		if(this.loginManager.addType(tfName.getText(),iconUrl,jcb.isSelected()))
		{
			mainPanel.setStatusText(loginManager.getMessageText(),true);
			mainPanel.updatePanelUI();
			this.dispose();
		}
		else
		{
			JOptionPane.showMessageDialog(null, loginManager.getMessageText(),
					"错误", JOptionPane.ERROR_MESSAGE);
			mainPanel.setStatusText(loginManager.getMessageText(),false);
			tfName.selectAll();
		}
	}
	
	public void modifyType()
	{
		String iconUrl;
		if(jcb.isSelected())
			iconUrl = labIcon.getText();
		else
			iconUrl = "image/defaultIcon.png";
		if(this.loginManager.modifyType(tfName.getText(),iconUrl,jcb.isSelected()))
		{
			mainPanel.setStatusText(loginManager.getMessageText(),true);
			loginManager.updateList();
			this.dispose();
		}
		else
		{
			JOptionPane.showMessageDialog(null, loginManager.getMessageText(),
					"错误", JOptionPane.ERROR_MESSAGE);
			mainPanel.setStatusText(loginManager.getMessageText(),false);
			tfName.selectAll();
		}
	}
	
	public void getIconUrl()
	{
		JFileChooser jfc = new JFileChooser(".");
		jfc.setAcceptAllFileFilterUsed(true);
		FileNameExtensionFilter jpgfilter = new FileNameExtensionFilter("JPEG (*.JPG)", "jpg");
		FileNameExtensionFilter pngfilter = new FileNameExtensionFilter("PNG (*.PNG)", "png");
		FileNameExtensionFilter giffilter = new FileNameExtensionFilter("GIF (*.GIF)", "gif");
		FileNameExtensionFilter bmpfilter = new FileNameExtensionFilter("BMP (*.BMP)", "bmp");
		jfc.addChoosableFileFilter(bmpfilter);
		jfc.addChoosableFileFilter(giffilter);
		jfc.addChoosableFileFilter(pngfilter);
		jfc.addChoosableFileFilter(jpgfilter);
		int result = jfc.showOpenDialog(null);
		if(result == JFileChooser.APPROVE_OPTION)
			labIcon.setText(jfc.getSelectedFile().getAbsolutePath());
		else
			labIcon.setText("");
	}
	
	public void onCancel()
	{
		this.dispose();
	}
}
