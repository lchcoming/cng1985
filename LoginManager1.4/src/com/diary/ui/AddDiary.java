package com.diary.ui;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JMenu;
import java.awt.Rectangle;
import javax.swing.JToolBar;
import javax.swing.JTree;

public class AddDiary extends JPanel {

	private static final long serialVersionUID = 1L;
	private JToolBar jToolBar = null;
	private JTree jTree = null;

	/**
	 * This is the default constructor
	 */
	public AddDiary() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(727, 376);
		this.setLayout(null);
		this.add(getJToolBar(), null);
		this.add(getJTree(), null);
	}

	/**
	 * This method initializes jToolBar	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJToolBar() {
		if (jToolBar == null) {
			jToolBar = new JToolBar();
			jToolBar.setBounds(new Rectangle(1, 30, 723, 69));
		}
		return jToolBar;
	}

	/**
	 * This method initializes jTree	
	 * 	
	 * @return javax.swing.JTree	
	 */
	private JTree getJTree() {
		if (jTree == null) {
			jTree = new JTree();
			jTree.setBounds(new Rectangle(4, 104, 171, 267));
		}
		return jTree;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
