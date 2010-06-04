package UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import UI.Base.GradientButton2;

import DataManager.ConfigManager;

public class MainFrame extends JFrame{

	public int frmWidth = 800;
	public int frmHeight = 600;
	public ConfigManager configManager;
	public JPanel contentPanel;
	
	public MainFrame()
	{
		configManager = new ConfigManager();
		this.setSize(frmWidth, frmHeight);
		this.setMinimumSize(new Dimension(640,480));
		this.setTitle("登录信息管理器");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.locateToScreen();
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				closeApplication();
			}
		});
	}
	
	public void init()
	{
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		this.loadConfig();
		this.add(contentPanel,BorderLayout.CENTER);
	}
	
	private void locateToScreen()
	{
		Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
		int scrx = (int)(scrSize.getWidth()-frmWidth) / 2;
		int scry = (int)(scrSize.getHeight()-frmHeight)/2;
		this.setLocation(scrx, scry);
	}
	
	private void loadConfig()
	{
		configManager.load();
		if(configManager.isOpenLastFile())
			contentPanel = new MainPanel(this,configManager);
		else
			contentPanel = new WelcomePanel(this);
	}
	
	public void closeApplication()
	{
//		JButton btnYes = new GradientButton2("确认");
//		JButton btnNo = new GradientButton2("取消");
//		btnNo.addActionListener(new ActionListener(){
//
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//				//这里怎么写
//			}
//			
//		});
//		Object[] options = new Object[]{btnYes,btnNo};
//		int result = JOptionPane.showOptionDialog(null, 
//				"你真的要退出吗?",
//				"确认退出",
//				JOptionPane.YES_NO_OPTION,
//				JOptionPane.QUESTION_MESSAGE,
//				null,
//				options,
//				null);
//		System.out.println(result);
		int result = JOptionPane.showConfirmDialog(null, 
				"你真的要退出吗?",
				"确认退出",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null);
		if(result == JOptionPane.YES_OPTION)
		{
			configManager.save();
			this.dispose();
			System.exit(0);
		}
	}
	
	public String getFontName()
	{
		return configManager.getFontName();
	}
	
	public int getFontSize()
	{
		return configManager.getFontSize();
	}
	
	public void showUI(boolean maximize)
	{
		Font font = new Font("宋体",Font.PLAIN,12);
		UIManager.put("Menu.font",font);
		UIManager.put("MenuItem.font", font);
		UIManager.put("Button.font", font);
		UIManager.put("Label.font", font);
		UIManager.put("CheckBox.font", font);
		UIManager.put("ComboBox.font", font);
		SwingUtilities.updateComponentTreeUI(this);
		this.setVisible(true);
		if(maximize)
			this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	public static void main(String[] args)
	{
		MainFrame mainFrame = new MainFrame();
		mainFrame.init();
		mainFrame.showUI(false);
	}
	
	

}
