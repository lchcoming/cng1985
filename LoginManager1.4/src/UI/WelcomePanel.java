package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import UI.Base.GradientButton;

public class WelcomePanel extends JPanel {
	
	private MainFrame mainFrame;
	
	public WelcomePanel(JFrame mainFrame)
	{
		//this.mainFrame = mainFrame;
		this.setLayout(new BorderLayout());
		initUI();
	}
	public WelcomePanel(MainFrame mainFrame)
	{
		this.mainFrame = mainFrame;
		this.setLayout(new BorderLayout());
		initUI();
	}
	public void initUI()
	{
		initMenu();
		initContent();
	}
	
	private void initMenu()
	{
		JMenuBar menuBar = this.mainFrame.getJMenuBar();
		menuBar.removeAll();
		JMenu mnuFile = new JMenu("程序");
		JMenuItem miExit = new JMenuItem("退出");
		mnuFile.add(miExit);
		miExit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				closeApplication();
			}
			
		});
		menuBar.add(mnuFile);
		this.mainFrame.setJMenuBar(menuBar);
	}
	
	private void initContent()
	{
		initTop();
		initLeft();
		initRight();
		initBottom();
		initCenter();
	}
	
	private void initTop()
	{
		JLabel topArea = new JLabel();
		topArea.setPreferredSize(new Dimension(this.getWidth(),130));
		this.add(topArea,BorderLayout.NORTH);
	}
	
	private void initLeft()
	{
		JLabel leftArea = new JLabel();
		leftArea.setPreferredSize(new Dimension(50,this.getHeight()));
		this.add(leftArea,BorderLayout.WEST);
	}
	
	private void initRight()
	{
		JLabel leftArea = new JLabel();
		leftArea.setPreferredSize(new Dimension(50,this.getHeight()));
		this.add(leftArea,BorderLayout.EAST);
	}
	
	private void initCenter()
	{
		JPanel centerArea = new JPanel();
		this.add(centerArea,BorderLayout.CENTER);
		centerArea.setLayout(new BorderLayout());
		centerArea.setOpaque(false);//为了使后续载入的JPanel能透明
		loadIntroPanel(centerArea);
		loadButtonPanel(centerArea);
	}
	
	private void loadIntroPanel(JPanel pa)
	{
		JPanel introPanel = new JPanel();
		introPanel.setLayout(new BorderLayout());
		JTextArea taText = new JTextArea();
		taText.setEditable(false);
		taText.setBorder(null);
		taText.setLineWrap(true);
		taText.setText(this.textInfor());
		JScrollPane jscroll = new JScrollPane(taText);
		jscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jscroll.setBorder(new LineBorder(new Color(200,200,200),1));
		introPanel.add(jscroll);
		JLabel labTitle = new JLabel(){
			public void paintComponent(Graphics g)
			{
				Graphics2D g2 = (Graphics2D)g;
				GradientPaint gp = new GradientPaint(0,0,new Color(239,243,249),0,getHeight()/2,new Color(220,229,241));
				g2.setPaint(gp);
				g2.fillRect(0, 0, getWidth()-2, getHeight()/2);
				GradientPaint gp2 = new GradientPaint(0,getHeight()/2,new Color(187,206,229),0,getHeight(),new Color(221,232,242));
				g2.setPaint(gp2);
				g2.fillRect(0, getHeight()/2, getWidth(), getHeight());
				g2.setColor(new Color(98,140,197));
				g2.drawRect(0, 0, getWidth()-2, getHeight()-1);
				g2.setColor(Color.WHITE);
				g2.drawString("关于此软件…", 11, 18);
				g2.setColor(new Color(0,50,100));
				g2.drawString("关于此软件…", 10, 17);
			}
		};
		labTitle.setPreferredSize(new Dimension(this.getWidth(),25));
		introPanel.add(labTitle,BorderLayout.NORTH);
		pa.add(introPanel,BorderLayout.CENTER);
	}
	
	private void loadButtonPanel(JPanel pa)
	{
		JPanel buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);
		buttonPanel.setPreferredSize(new Dimension(250,this.getHeight()));
		buttonPanel.setLayout(new FlowLayout());
		JButton btnAdd = new GradientButton("新建记录库");
		btnAdd.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("image/Add.png")));
		btnAdd.setPreferredSize(new Dimension(200,50));
		btnAdd.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mainFrame.getContentPane().removeAll();
				JPanel mainPanel;
				mainFrame.getContentPane().add(mainPanel = new MainPanel(mainFrame,mainFrame.configManager));
				mainPanel.updateUI();
			}
			
		});
		buttonPanel.add(btnAdd);
		JButton btnOpen = new GradientButton("打开记录库");
		btnOpen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("image/Open.png")));
		btnOpen.setPreferredSize(new Dimension(200,50));
		btnOpen.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFileChooser jfc = new JFileChooser(".");
				FileNameExtensionFilter lifFilter = new FileNameExtensionFilter("记录信息文件 (*.LIF)", "lif");
				jfc.addChoosableFileFilter(lifFilter);
				int res = jfc.showOpenDialog(null);
				if(res == JFileChooser.APPROVE_OPTION)
				{
					String fileName = jfc.getSelectedFile().getName();
					mainFrame.getContentPane().removeAll();
					MainPanel mainPanel;
					mainFrame.getContentPane().add(mainPanel = new MainPanel(mainFrame,mainFrame.configManager));
					mainPanel.openFile(fileName);
					mainPanel.updateUI();
				}
				else
					return;
				
			}
			
		});
		buttonPanel.add(btnOpen);
		pa.add(buttonPanel,BorderLayout.EAST);
	}
	
	private void initBottom()
	{
		JLabel bottomArea = new JLabel("Designed by GreenTea");
		bottomArea.setForeground(new Color(100,100,150));
		bottomArea.setFont(new Font("Tahoma",Font.BOLD,12));
		bottomArea.setHorizontalAlignment(SwingConstants.CENTER);
		bottomArea.setPreferredSize(new Dimension(this.getWidth(),30));
		this.add(bottomArea,BorderLayout.SOUTH);
	}
	
	private String textInfor()
	{
		StringBuilder str = new StringBuilder();
		try {
			Scanner sc = new Scanner(new FileReader("readme.txt"));
			while(sc.hasNext())
			{
				str.append(sc.nextLine()+"\r\n");
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str.toString();
	}
	
	private Image load(String filename)
	{
		return new ImageIcon(this.getClass().getClassLoader().getResource(filename)).getImage();
	}
	
	private void closeApplication()
	{
		this.mainFrame.closeApplication();
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		g2d.drawImage(this.load("image/welcomeBG.jpg"), this.getWidth()-287, this.getHeight()-252, null);
		for(int x=0;x<this.getWidth();x++)
			g2d.drawImage(this.load("image/titleBG.gif"), x, 0, null);
		g2d.drawImage(this.load("image/title.jpg"), 0, 0, null);
	}
}
