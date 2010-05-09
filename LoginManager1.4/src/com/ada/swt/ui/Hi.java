package com.ada.swt.ui;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.graphics.Rectangle;

public class Hi extends Composite {

	private Text text = null;
	private CLabel cLabel = null;
	private Button button = null;

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
		new Hi(shell, SWT.NONE);
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public Hi(Composite parent, int style) {
		super(parent, style);
		initialize();
	}

	private void initialize() {
		cLabel = new CLabel(this, SWT.NONE);
		cLabel.setText("CLabel");
		cLabel.setBounds(new Rectangle(3, 3, 45, 23));
		text = new Text(this, SWT.BORDER);
		text.setBounds(new Rectangle(93, 69, 73, 23));
		button = new Button(this, SWT.NONE);
		button.setText("µ¥»÷");
	//	this.setLayout(new FillLayout());
		button.setBounds(new Rectangle(210, 38, 36, 27));
		button.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				System.out.println("widgetSelected()"+e.getSource()); // TODO Auto-generated Event stub widgetSelected()
				System.out.println("widgetSelected()"+e.data);
			}
		});
		this.setLayout(null);
		setSize(new Point(494, 212));
	}

}  //  @jve:decl-index=0:visual-constraint="67,43"
