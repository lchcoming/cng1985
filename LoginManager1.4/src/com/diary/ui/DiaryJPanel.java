/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: LoginManager1.4<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.diary.ui;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  May 6, 2010<br />   
 * Modified By£ºada.young          <br />                                
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
	JMenuBar menuBar = this.mainFrame.getJMenuBar();
	menuBar.removeAll();
	JMenu mnuFile = new JMenu("³ÌÐò");
	JMenuItem miExit = new JMenuItem("ÍË³ö");
	mnuFile.add(miExit);
	miExit.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			//closeApplication();
		}
		
	});
	menuBar.add(mnuFile);
	
}


}

