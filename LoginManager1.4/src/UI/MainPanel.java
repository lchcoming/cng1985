package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

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
import javax.swing.JPopupMenu;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import UI.Base.MyJMenuItem;

import DataManager.ConfigManager;
import DataManager.LoginManager;

public class MainPanel extends JPanel {

	public MainFrame mainFrame;
	private LoginManager loginManager;
	
	private JMenuBar menuBar;
	private MyJMenuItem miNew;
	private MyJMenuItem miOpen;
	private MyJMenuItem miSave;
	private MyJMenuItem miSaveas;
	private MyJMenuItem miExport;
	private MyJMenuItem miExit;
	
	private MyJMenuItem miCopy;
	private MyJMenuItem miCut;
	private MyJMenuItem miPaste;
	private MyJMenuItem miEmptyInput;
	
	private MyJMenuItem miAddType;
	private MyJMenuItem miModifyType;
	private MyJMenuItem miDelType;
	private MyJMenuItem miAddLogin;
	private MyJMenuItem miDelLogin;
	private MyJMenuItem miModifyLogin;
	private MyJMenuItem miFindLogin;
	private MyJMenuItem miUpdate;
	private MyJMenuItem miOption;
	private MyJMenuItem miAbout;
	private JPanel toolBar;
	private JButton tbNew;
	private JButton tbOpen;
	private JButton tbSave;
	private JButton tbExport;
	private JButton tbUpdate;
	private JButton tbOption;
	private JButton tbHelp;
	private JButton tbExit;
	private JSplitPane split;
	public LeftPanel leftPanel;
	public RightPanel rightPanel;
	public BottomPanel bottomPanel;
	private JPanel statusbar;
	private JLabel statusInfo;
	
	public JPopupMenu popMenu;
	
	public MainPanel(MainFrame mainFrame,ConfigManager configManager)
	{
		loginManager = new LoginManager(configManager);
		this.mainFrame = mainFrame;
		this.setLayout(new BorderLayout(0,0));
		initUI();
		if(loginManager.configManager.load())
		{
			if(loginManager.configManager.isOpenLastFile())
				this.openFile(loginManager.configManager.getLastFileName());
			if(loginManager.configManager.isMaxium())
				this.mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		}
	}

	private void initUI()
	{
		initMenu();
		initPopupMenu();
		initToolBar();
		initSplit();
		initStatusBar();
		updateTitle();
	}
	
	private void initMenu()
	{
		JMenuBar menuBar = mainFrame.getJMenuBar();
		menuBar.removeAll();
		JMenu mnuFile = new JMenu("�ļ�(F)");
		JMenu mnuEdit = new JMenu("�༭(E)");
		JMenu mnuLogin = new JMenu("��¼(L)");
		JMenu mnuSetup = new JMenu("����(S)");
		JMenu mnuHelp = new JMenu("����(H)");
		mnuFile.setMnemonic('F');
		mnuEdit.setMnemonic('E');
		mnuLogin.setMnemonic('L');
		mnuSetup.setMnemonic('S');
		mnuHelp.setMnemonic('H');
		menuBar.add(mnuFile);
		menuBar.add(mnuEdit);
		menuBar.add(mnuLogin);
		menuBar.add(mnuSetup);
		menuBar.add(mnuHelp);
		
		mnuFile.add(miNew = setMenuItem("�½�","image/newfile.gif",KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK)));
		mnuFile.add(miOpen = setMenuItem("��...","image/open.gif",KeyStroke.getKeyStroke(KeyEvent.VK_O,Event.CTRL_MASK)));
		mnuFile.add(miSave = setMenuItem("����","image/save.gif",KeyStroke.getKeyStroke(KeyEvent.VK_S,Event.CTRL_MASK)));
		mnuFile.add(miSaveas = setMenuItem("���Ϊ...",null,null));
		mnuFile.addSeparator();
		mnuFile.add(miExport = setMenuItem("����...",null,null));
		mnuFile.addSeparator();
		mnuFile.add(miExit = setMenuItem("�˳�",null,KeyStroke.getKeyStroke(KeyEvent.VK_X,Event.CTRL_MASK+Event.ALT_MASK)));
		
		mnuEdit.add(miCopy = setMenuItem("����","image/copy.gif",KeyStroke.getKeyStroke(KeyEvent.VK_C,Event.CTRL_MASK)));
		mnuEdit.add(miCut = setMenuItem("����","image/cut.gif",KeyStroke.getKeyStroke(KeyEvent.VK_X,Event.CTRL_MASK)));
		mnuEdit.add(miPaste = setMenuItem("ճ��","image/paste.gif",KeyStroke.getKeyStroke(KeyEvent.VK_V,Event.CTRL_MASK)));
		mnuEdit.addSeparator();
		mnuEdit.add(miEmptyInput = setMenuItem("��������",null,null));
		
		mnuLogin.add(miAddType = setMenuItem("��������...",null,null));
		mnuLogin.add(miModifyType = setMenuItem("�޸ķ���...",null,null));
		mnuLogin.add(miDelType = setMenuItem("ɾ������",null,null));
		mnuLogin.addSeparator();
		mnuLogin.add(miAddLogin = setMenuItem("������¼",null,null));
		mnuLogin.add(miDelLogin = setMenuItem("ɾ����¼",null,null));
		mnuLogin.add(miModifyLogin = setMenuItem("�޸ļ�¼",null,null));
		mnuLogin.add(miFindLogin = setMenuItem("���Ҽ�¼",null,null));
		mnuLogin.addSeparator();
		mnuLogin.add(miUpdate = setMenuItem("ˢ��","image/refresh.gif",null));
		
		mnuSetup.add(miOption = setMenuItem("��������...","image/setup.gif",null));
		
		mnuHelp.add(miAbout = setMenuItem("����...","image/about.png",null));
	}
	
	private MyJMenuItem setMenuItem(String text,String icon,KeyStroke key)
	{
		MyJMenuItem item = new MyJMenuItem(text,icon,key);
//		if(icon != null)
//			item.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource(icon)));
//		if(key != null)
//			item.setAccelerator(key);
		item.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				actionMenuItem(e.getActionCommand());
			}
		});
		return item;
	}
	
	public void initPopupMenu() {
		popMenu = new JPopupMenu();
		MyJMenuItem miCopy = setMenuItem("����","image/copy.gif",KeyStroke.getKeyStroke(KeyEvent.VK_C,Event.CTRL_MASK));
		popMenu.add(miCopy);

		MyJMenuItem miPaste = setMenuItem("ճ��","image/paste.gif",KeyStroke.getKeyStroke(KeyEvent.VK_V,Event.CTRL_MASK));
		popMenu.add(miPaste);

		MyJMenuItem miCut = setMenuItem("����","image/cut.gif",KeyStroke.getKeyStroke(KeyEvent.VK_X,Event.CTRL_MASK));
		popMenu.add(miCut);
		popMenu.addSeparator();

		MyJMenuItem miEmptyInput = setMenuItem("��������",null,null);
		popMenu.add(miEmptyInput);
	}
	
	private void initToolBar()
	{
		toolBar = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0)){
			public void paintComponent(Graphics g)
			{
				g.drawImage(new ImageIcon(this.getClass().getClassLoader().getResource("image/titleBG2.gif")).getImage(),0,0,getWidth(),50,null);
				g.drawImage(new ImageIcon(this.getClass().getClassLoader().getResource("image/title2.jpg")).getImage(),this.getWidth()-300,0,null);
			}
		};
		toolBar.setPreferredSize(new Dimension(this.mainFrame.frmWidth,51));
		this.add(toolBar,BorderLayout.NORTH);
		toolBar.add(tbNew = setToolButton("�½�","image/tbnew.png"));
		toolBar.add(tbOpen = setToolButton("��","image/tbopen.png"));
		toolBar.add(tbSave = setToolButton("����","image/tbsave.png"));
		toolBar.add(tbExport = setToolButton("����","image/tbexport.png"));
		toolBar.add(new JLabel(new ImageIcon(this.getClass().getClassLoader().getResource("image/speart.jpg"))));
		toolBar.add(tbUpdate = setToolButton("ˢ��","image/tbudpate.png"));
		toolBar.add(tbOption = setToolButton("����","image/tbOption.png"));
		toolBar.add(new JLabel(new ImageIcon(this.getClass().getClassLoader().getResource("image/speart.jpg"))));
		toolBar.add(tbHelp = setToolButton("����","image/tbHelp.png"));
		toolBar.add(tbExit = setToolButton("�˳�","image/tbexit.png"));
	}
	
	private JButton setToolButton(String txt,String icon)
	{
		JButton btn = new ToolButton(txt);
		btn.setIcon(new ImageIcon(MainFrame.class.getClassLoader().getResource(icon)));
		btn.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn.setHorizontalTextPosition(SwingConstants.CENTER);
		btn.setMargin(new Insets(0,5,0,5));
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				actionToolButton(e.getActionCommand());
			}
		});
		return btn;
	}
	
	private void initSplit()
	{
		split = new JSplitPane();
		split.setBackground(Color.WHITE);
		split.setDividerSize(3);
		
		split.setLeftComponent(leftPanel = new LeftPanel(loginManager,this));
		split.setRightComponent(rightPanel = new RightPanel(loginManager,this));
		leftPanel.setListSelectItem(0);
		
		this.add(split);
	}
	
	private void initStatusBar()
	{
		JPanel statusBar = new JPanel(){
			public void paintComponent(Graphics g)
			{
				g.drawImage(new ImageIcon(this.getClass().getClassLoader().getResource("image/statusBG.gif")).getImage(),0,0,getWidth(),25,null);
			}
		};
		statusBar.setSize(this.getWidth(), 30);
		statusBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		statusInfo = new JLabel();
		statusInfo.setForeground(Color.WHITE);
		statusInfo.setText("׼��������");
		statusInfo.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("image/statDone.gif")));
		statusBar.add(statusInfo);
		this.add(statusBar,BorderLayout.SOUTH);
	}
	
	//����״̬�����ֺ�ͼ�꣬��errorΪfalseֵʱ��ʾ����ͼ�꣬Ϊtrueֵʱ��ʾ���ͼ��
	public void setStatusText(String text,boolean done)
	{
		statusInfo.setText(text);
		if(done)
			statusInfo.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("image/statDone.gif")));
		else
			statusInfo.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("image/statError.gif")));
	}
	
	//����������ı���
	public void updateTitle()
	{
		StringBuilder sb = new StringBuilder("��¼��Ϣ������ 1.4");
		sb.append(" - [");
		sb.append(loginManager.getFileName());
		sb.append("]");
		if(loginManager.isModifyFlag())
			sb.append("*");
		mainFrame.setTitle(sb.toString());
	}
	
	public void updateMenu()
	{
		miAddLogin.setEnabled(true);
		miModifyLogin.setEnabled(true);
		miDelLogin.setEnabled(true);
		if(bottomPanel.tfLogin.getText().equals("")||bottomPanel.tfUser.getText().equals("")||bottomPanel.tfPassword.getText().equals(""))
		{
			miAddLogin.setEnabled(false);
			miModifyLogin.setEnabled(false);
		}
		if(rightPanel.getTableSelectItem() < 0)
		{
			miModifyLogin.setEnabled(false);
			miDelLogin.setEnabled(false);
		}
	}
	
	public void updateMenuButton()
	{
		if(bottomPanel!=null)
			bottomPanel.updateButton();
		this.updateMenu();
		if(loginManager.getCurrType().equals("") || (loginManager.getCurrType() == null))
			miModifyType.setEnabled(false);
		else
			miModifyType.setEnabled(true);
	}
	
	//ˢ����������Ľ���
	public void updatePanelUI()
	{
		this.updateMenuButton();
		this.loginManager.updateList();
		this.loginManager.updateTable();
	}
	
	public void actionToolButton(String mi)
	{
		if(mi.equals("�½�"))
		{
			loginManager.newFile();
			this.updateMenuButton();
			this.updateTitle();
		}
		if(mi.equals("����"))
		{
			saveToFile(false);
		}
		if(mi.equals("��"))
		{
			openFromFile();
		}
		if(mi.equals("����"))
		{
			exprotFile();
		}
		if(mi.equals("ˢ��"))
		{
			this.updateUI();
		}
		if(mi.equals("����"))
		{
			showSetupDlg();
		}
		if(mi.equals("����"))
		{
			AboutDlg dlg = new AboutDlg(this.mainFrame);
			dlg.setVisible(true);
		}
		if(mi.equals("�˳�"))
		{
			ExitApplication();
		}
		updateTitle();
	}
	
	//�˵�����ʵ��
	public void actionMenuItem(String mi)
	{
		if(mi.equals("�˳�"))
		{
			ExitApplication();
		}
		if(mi.equals("��..."))
		{
			openFromFile();
		}
		if(mi.equals("����"))
		{
			bottomPanel.editMenuCopy();
		}
		if(mi.equals("����"))
		{
			bottomPanel.editMenuCut();
		}
		if(mi.equals("ճ��"))
		{
			bottomPanel.editMenuPaste();
		}
		if(mi.equals("����"))
		{
			if(loginManager.isModifyFlag())
				saveToFile(false);
		}
		if(mi.equals("���Ϊ..."))
		{
			if(!loginManager.getFileName().equals("δ����"))
				saveToFile(true);
		}
		if(mi.equals("����..."))
		{
			exprotFile();
		}
		if(mi.equals("��������"))
		{
			bottomPanel.resetInput();
		}
		if(mi.equals("��������..."))
		{
			showTypeDlg(true);
		}
		if(mi.equals("�޸ķ���..."))
		{
			showTypeDlg(false);
		}
		if(mi.equals("ɾ������"))
		{
			int res = JOptionPane.showConfirmDialog(null, "ȷ��Ҫɾ��\""+loginManager.getCurrType()+"\"��¼������", "��¼ɾ��ȷ��", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(res == JOptionPane.YES_OPTION)
				loginManager.deleteType();
		}
		if(mi.equals("������¼"))
		{
			bottomPanel.addLogin();
		}
		if(mi.equals("ɾ����¼"))
		{
			bottomPanel.deleteLogin();
		}
		if(mi.equals("�޸ļ�¼"))
		{
			bottomPanel.modifyLogin();
		}
		if(mi.equals("��������..."))
		{
			showSetupDlg();
		}
		if(mi.equals("ˢ��"))
		{
			this.updateUI();
		}
		if(mi.equals("����..."))
		{
			showAboutDlg();
		}
		updateTitle();
	}

	public void saveToFile(boolean saveAs)
	{
			if (loginManager.getFileName().equals("δ����") || saveAs == true) {
			JFileChooser jfc = new JFileChooser(".");
			FileNameExtensionFilter lifFilter = new FileNameExtensionFilter(
					"��¼��Ϣ�ļ� (*.LIF)", "lif");
			jfc.addChoosableFileFilter(lifFilter);
			int res = jfc.showSaveDialog(this);
			if (res == JFileChooser.APPROVE_OPTION) {
				String fileName = jfc.getSelectedFile().getName().toLowerCase();
				if (fileName.length() >= 4) {
					if (!fileName.substring(fileName.length() - 4,
							fileName.length()).equals(".lif"))
						fileName = fileName + ".lif";
				}
				if (fileName.length() < 4)
					fileName = fileName + ".lif";
				loginManager.setFileName(fileName);
			} else
				return;
		}
		loginManager.saveFile(loginManager.getFileName());
		updateTitle();
	}
	
	public void openFile(String fileName)
	{
		loginManager.setFileName(fileName);
		if(loginManager.openFile(fileName))
		{
			this.setStatusText(loginManager.getMessageText(),true);
			updateTitle();
		}
		else
			this.setStatusText(loginManager.getMessageText(),false);
	}
	
	public void openFromFile()
	{
		JFileChooser jfc = new JFileChooser(".");
		FileNameExtensionFilter lifFilter = new FileNameExtensionFilter("��¼��Ϣ�ļ� (*.LIF)", "lif");
		jfc.addChoosableFileFilter(lifFilter);
		int res = jfc.showOpenDialog(this);
		if(res == JFileChooser.APPROVE_OPTION)
		{
			loginManager.setFileName(jfc.getSelectedFile().getName());
			if(loginManager.openFile(jfc.getSelectedFile().getName()))
			{
				this.setStatusText(loginManager.getMessageText(),true);
				updateTitle();
			}
			else
				this.setStatusText(loginManager.getMessageText(),false);
		}
		else
			return;
		
	}
	
	public void exprotFile()
	{
		JFileChooser jfc = new JFileChooser(".");
		FileNameExtensionFilter lifFilter = new FileNameExtensionFilter("�ı��ļ� (*.TXT)", "txt");
		jfc.addChoosableFileFilter(lifFilter);
		int res = jfc.showSaveDialog(this);
		if(res == JFileChooser.APPROVE_OPTION)
		{
			loginManager.setFileName(jfc.getSelectedFile().getName());
			if(loginManager.exportFile(jfc.getSelectedFile().getName()))
				this.setStatusText(loginManager.getMessageText(),false);
			else
				this.setStatusText(loginManager.getMessageText(), true);
		}	
		else
			return;
	}
	
	public void saveSetup()
	{
		loginManager.configManager.save();
	}
	
	public void loadSetup()
	{
		if(!loginManager.configManager.load())
			this.setStatusText("�����ļ�δ������", true);
	}
	
	public void showSetupDlg()
	{
		SetupDialog dlg = new SetupDialog(this.mainFrame,loginManager.configManager);
		dlg.setModal(true);
		dlg.setVisible(true);
		rightPanel.SetupTableFont(loginManager.configManager.getFontName(), loginManager.configManager.getFontSize());
		updateUI();
	}
	
	public void showAboutDlg()
	{
		AboutDlg dlg = new AboutDlg(this.mainFrame);
		dlg.setVisible(true);
	}
	
	//��ʾ��¼����Ի��򣬲������Ծ����Ի��������ڶԼ�¼��������ӻ����޸�
	public void showTypeDlg(boolean addType)
	{
		TypeDialog dlg = new TypeDialog(this.mainFrame,this,this.loginManager,addType);
		dlg.setModal(true);
		dlg.setResizable(false);
		dlg.setVisible(true);
	}
	
	public void ExitApplication()
	{
		if(loginManager.isModifyFlag())
		{
			int res = JOptionPane.showConfirmDialog(null, "�ļ��Ѹ��ģ��Ƿ񱣴棿", "�˳�����", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(res == JOptionPane.YES_OPTION)
			{
				this.saveToFile(false);
			}
			if(res == JOptionPane.CANCEL_OPTION)
				return;
		}
		loginManager.configManager.save();
		if(loginManager.configManager.isAutoExport())
			loginManager.exportFile("AutoExport.txt");
		System.exit(0);
	}
}
