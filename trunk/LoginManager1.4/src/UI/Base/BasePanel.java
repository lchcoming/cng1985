package UI.Base;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UI.MainPanel;

import DataManager.LoginManager;

//设置一个基类面板，实现一个自定义文字的标题栏和能实现一个背景
public class BasePanel extends JPanel {

	protected LoginManager loginManager;
	protected MainPanel mainPanel;
	protected String backgroundImage;
	protected JLabel labTitle;
	protected String icon;
	
	public BasePanel()
	{
		this.loginManager = loginManager;
		this.mainPanel = mainPanel;
		this.setLayout(new BorderLayout());
		this.setOpaque(false);
		initTitleBar();
	}
	
	
	protected void initTitleBar()
	{
		labTitle = new JLabel(){
			//绘制一个带玻璃质感的渐变标题栏背景
			private Color color1 = new Color(239,243,249);
			private Color color2 = new Color(220,229,241);
			private Color color3 = new Color(187,206,229);
			private Color color4 = new Color(221,232,242);
			private Color frameColor = new Color(98,140,197);
			
			public void paintComponent(Graphics g)
			{
				Graphics2D g2 = (Graphics2D)g;
				GradientPaint gPaint1 = new GradientPaint(0,0,color1,0,getHeight()/2,color2);
				g2.setPaint(gPaint1);
				g2.fillRect(0, 0, getWidth(), getHeight()/2);
				GradientPaint gp2 = new GradientPaint(0,getHeight()/2,color3,0,getHeight(),color4);
				g2.setPaint(gp2);
				g2.fillRect(0, getHeight()/2, getWidth(), getHeight());
				g2.setColor(frameColor);
				g2.drawRect(0, 0, getWidth()-2, getHeight()-1);
				if(icon!=null)
				{
					URL url = this.getClass().getClassLoader().getResource(icon);
					if(url!=null)
						g2.drawImage(new ImageIcon(this.getClass().getClassLoader().getResource(icon)).getImage(), 8, 4, 16, 16, null);
				}
				g2.setColor(new Color(50,80,120));
				g2.drawString(this.getText(), 30, 17);
				g2.dispose();
			}
			
		};
		labTitle.setPreferredSize(new Dimension(getWidth(),25));
		this.add(labTitle,BorderLayout.NORTH);
	}
	
	public void setTitle(String text,String icon)
	{
		labTitle.setFont(new Font("宋体",Font.BOLD,12));
		labTitle.setText(text);
		labTitle.setIconTextGap(6);
		if(icon != null)
			this.icon = icon;
	}
	
	public void setTitle(String text)
	{
		this.setTitle(text, null);
	}
	
	public void setBackgroundImage(String file)
	{
		this.backgroundImage = file;
	}
	
	public Image loadImage(String filename)
	{
		return new ImageIcon(this.getClass().getClassLoader().getResource(filename)).getImage(); 
	}
	
	public void paintComponent(Graphics g)
	{
		if(this.backgroundImage != null)
		{
			g.drawImage(this.loadImage(backgroundImage), 0, 0, getWidth(), getHeight(), null);
		}
		super.paintComponent(g);
	}
}
