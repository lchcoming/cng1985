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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class DiaryJPanel extends JPanel {
	private JFrame mainFrame;
public DiaryJPanel(JFrame jframe){
	mainFrame=jframe;
	this.setLayout(new BorderLayout());
	initUI();	
}

private void initUI() {
	JMenuBar menuBar = mainFrame.getJMenuBar();
	menuBar.removeAll();
	JMenu mnuFile = new JMenu("文件(F)");
	JMenu mnuEdit = new JMenu("编辑(E)");
	JMenu mnuLogin = new JMenu("记录(L)");
	JMenu mnuSetup = new JMenu("设置(S)");
	JMenu mnuHelp = new JMenu("帮助(H)");
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
	
}


}

