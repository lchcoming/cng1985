/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: LoginManager1.4<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.diary.ui;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  May 6, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:May 6, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.diary.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import UI.WelcomePanel;

public class DiaryJFrame extends JFrame {
	public JPanel contentPanel;
	public int frmWidth = 800;
	public int frmHeight = 600;
	public DiaryJFrame(){
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
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		contentPanel = new DiaryJPanel(this);
		this.add(contentPanel,BorderLayout.CENTER);
		this.setVisible(true);
	}
	private void locateToScreen()
	{
		Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
		int scrx = (int)(scrSize.getWidth()-frmWidth) / 2;
		int scry = (int)(scrSize.getHeight()-frmHeight)/2;
		this.setLocation(scrx, scry);
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
			//configManager.save();
			this.dispose();
			System.exit(0);
		}
	}
}

