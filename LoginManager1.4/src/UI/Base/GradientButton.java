package UI.Base;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.JButton;

public class GradientButton extends JButton {
	private Color color1 = new Color(255,255,255);
	private Color color2 = new Color(243,248,228);
	private Color color3 = new Color(223,238,176);
	private Color color4 = new Color(241,247,222);
	private Color color5 = new Color(153,203,8);
	private Color fontColor = new Color(57,85,0);
	
	public GradientButton()
	{
		super();
		this.setFont(new Font("宋体",Font.PLAIN,12));
		this.setContentAreaFilled(false);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setFocusable(false);//如果值为true的话会在按钮文字上出现一个方框影响美观
		this.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e)
			{
				color1 = new Color(241,245,255);
				color2 = new Color(230,238,255);
				color3 = new Color(186,202,233);
				color4 = new Color(237,244,255);
				color5 = new Color(166,193,253);
				fontColor = new Color(0,0,0);
			}
			public void mouseReleased(MouseEvent e)
			{
				color1 = new Color(241,245,255);
				color2 = new Color(230,238,255);
				color3 = new Color(206,222,253);
				color4 = new Color(237,244,255);
				color5 = new Color(166,193,253);
				fontColor = new Color(0,0,0);
			}
			public void mousePressed(MouseEvent e)
			{
				color3 = new Color(241,245,255);
				color4 = new Color(230,238,255);
				color1 = new Color(206,222,253);
				color2 = new Color(237,244,255);
				color5 = new Color(166,193,253);
				fontColor = new Color(0,0,0);
			}
			public void mouseExited(MouseEvent e)
			{
				color1 = new Color(255,255,255);
				color2 = new Color(243,248,228);
				color3 = new Color(223,238,176);
				color4 = new Color(241,247,222);
				color5 = new Color(153,203,8);
				fontColor = new Color(57,85,0);
			}
		});
	}
	public GradientButton(String text)
	{
		this();
		this.setFont(new Font("宋体",Font.BOLD,14));
		this.setText(text);
	}
	
	protected void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		GradientPaint p1 = new GradientPaint(0,0,color1,0,getHeight(),color2);
		GradientPaint p2 = new GradientPaint(0,0,color3,0,getHeight(),color4);
		Paint oldPaint = g2.getPaint();
		g2.setPaint(p1);
		g2.fillRect(1, 1, getWidth()-3, getHeight()/2);
		g2.setPaint(p2);
		g2.fillRect(1, getHeight()/2, getWidth()-3, getHeight()-1);
		g2.setPaint(oldPaint);
		this.setForeground(fontColor);
		super.paintComponent(g);
	}
	protected void paintBorder(Graphics g)
	{
		g.setColor(new Color(0xffffff));
		g.drawRoundRect(1, 1, getWidth()-3, getHeight()-3,3,3);
		g.setColor(color5);
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1,6,6);
	}
}

	