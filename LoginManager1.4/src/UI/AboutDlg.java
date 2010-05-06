package UI;
import javax.swing.*;
import javax.swing.border.LineBorder;

import UI.Base.GradientButton2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AboutDlg extends JWindow{
	private int dlgWidth = 500;
	private int dlgHeight = 350;
	private JTextArea txtarea = new JTextArea();
	
	public AboutDlg(JFrame frm)
	{
		super();
		int lx = (frm.getWidth() - dlgWidth) / 2 + frm.getX();
		int ly = (frm.getHeight() - dlgHeight) / 2 + frm.getY();
		this.setBounds(lx, ly, dlgWidth, dlgHeight);
		this.setContentPane(init());
		this.setBackground(new Color(0xffffff));
	}
	
	public JPanel init()
	{
		JPanel panel = new JPanel(){
			public void paintComponent(Graphics g)
			{
				paintBackground(g);
				super.paintComponents(g);
			}
		};
		panel.setLayout(null);
		JButton btnOK = new GradientButton2("确定");
		btnOK.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				onOK();
			}
			
		});
		panel.add(btnOK);
		btnOK.setBounds(dlgWidth-120, dlgHeight-50, 100, 30);
		txtarea.setEditable(false);
		txtarea.setText(textInfor());
		txtarea.setLineWrap(true);//文本域自动换行
		txtarea.setCaretPosition(0);
		JScrollPane sp = new JScrollPane(txtarea); 
		panel.add(sp);
		sp.setBounds(20, 100, 460, 180);
		JLabel labCopy = new JLabel("作者：绿茶 当前版本：1.4");
		panel.add(labCopy);
		labCopy.setBounds(20, dlgHeight-40, 300, 20);
		sp.setBorder(new LineBorder(new Color(0xaaaaaa)));
		return panel;
	}
	
	public void paintBackground(Graphics g)
	{
		g.drawImage(new ImageIcon(MainFrame.class.getClassLoader().getResource("image/aboutBg.jpg")).getImage(), 0, 0, getWidth(),55,null);
		g.drawImage(new ImageIcon(MainFrame.class.getClassLoader().getResource("image/aboutTitle.jpg")).getImage(), getWidth()-300, 0, null);
		g.setColor(new Color(0xaaaaaa));
		g.drawRect(0, 0, dlgWidth-1, dlgHeight-1);
	}
	
	public void onOK()
	{
		this.dispose();
	}
	
	public String textInfor()
	{
		StringBuilder str = new StringBuilder();
//		try {
//			File f = new File("readme.txt");
//			long fSize = f.length();
//			System.out.println(fSize);
//			char[] ch = new char[1];
//			FileReader fr = new FileReader(f);
//			for(long i=0;i<=fSize;i++)
//			{
//				fr.read(ch);
//				str.append(ch);
//			}
//			fr.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
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
}
