package com.ada.swt.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public class MainApp extends Composite {

	private TabFolder tabFolder = null;
	private Tree tree = null;
	private ProgressBar progressBar = null;
	private Button button = null;

	/**
	 * This method initializes tabFolder	
	 *
	 */
	private void createTabFolder() {
		tabFolder = new TabFolder(this, SWT.NONE);
		tabFolder.setBounds(new Rectangle(261, 73, 72, 72));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Before this is run, be sure to set up the launch configuration (Arguments->VM Arguments)
		 * for the correct SWT library path in order to run with the SWT dlls. 
		 * The dlls are located in the SWT plugin jar.  
		 * For example, on Windows the Eclipse SWT 3.1 plugin jar is:
		 *       installation_directory\plugins\org.eclipse.swt.win32_3.1.0.jar
		 */
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		shell.setSize(new Point(300, 200));
		new MainApp(shell, SWT.NONE);
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public MainApp(Composite parent, int style) {
		super(parent, style);
		initialize();
	}

	private void initialize() {
		createTabFolder();
		setSize(new Point(733, 354));
		setLayout(null);
		tree = new Tree(this, SWT.NONE);
		tree.setBounds(new Rectangle(4, 9, 196, 338));
		//tree.setTopItem(arg0)
		 for (int i=0; i<4; i++) {
			   TreeItem iItem = new TreeItem (tree, 0);
			   iItem.setText ("TreeItem (0) -" + i);
			   for (int j=0; j<4; j++) {
			    TreeItem jItem = new TreeItem (iItem, 0);
			    jItem.setText ("TreeItem (1) -" + j);
			    for (int k=0; k<4; k++) {
			     TreeItem kItem = new TreeItem (jItem, 0);
			     kItem.setText ("TreeItem (2) -" + k);
			     for (int l=0; l<4; l++) {
			      TreeItem lItem = new TreeItem (kItem, 0);
			      lItem.setText ("TreeItem (3) -" + l);
			     }
			    }
			   }
			  }
		
		progressBar = new ProgressBar(this, SWT.NONE);
		progressBar.setBounds(new Rectangle(100, 335, 170, 17));
		button = new Button(this, SWT.NONE);
		button.setBounds(new Rectangle(447, 207, 109, 27));
		button.setText("dfsfdf");
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
