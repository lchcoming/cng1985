package com.diary.ui;

import java.awt.BorderLayout;

import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JTree;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;

public class AddDiaryFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JTree jTree = null;
	private JPanel jPanel = null;
	private JToolBar jToolBar = null;

	/**
	 * This is the default constructor
	 */
	public AddDiaryFrame() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(536, 399);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridLayout gridLayout = new GridLayout();
			gridLayout.setRows(1);
			jContentPane = new JPanel();
			//jContentPane.setLayout(gridLayout);
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJTree(), BorderLayout.WEST);
			jContentPane.add(getJPanel(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			JMenu mnuFile = new JMenu("文件(F)");
			JMenu mnuEdit = new JMenu("编辑(E)");
			JMenu mnuLogin = new JMenu("记录(L)");
			JMenu mnuSetup = new JMenu("设置(S)");
			JMenu mnuHelp = new JMenu("帮助(H)");
			jJMenuBar.add(mnuFile);
			jJMenuBar.add(mnuEdit);
			jJMenuBar.add(mnuLogin);
			jJMenuBar.add(mnuSetup);
			jJMenuBar.add(mnuHelp);
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jTree	
	 * 	
	 * @return javax.swing.JTree	
	 */
	private JTree getJTree() {
		if (jTree == null) {
			jTree = new JTree();
		}
		return jTree;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.gridx = 0;
			jPanel = new JPanel();
			jPanel.setLayout(new GridBagLayout());
			jPanel.add(getJToolBar(), gridBagConstraints);
		}
		return jPanel;
	}

	/**
	 * This method initializes jToolBar	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJToolBar() {
		if (jToolBar == null) {
			jToolBar = new JToolBar();
		}
		return jToolBar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
