package UI.Base;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;

public class MyJMenuItem extends JMenuItem implements MouseListener{
	private boolean isSelected;
	
	public MyJMenuItem(String text,String icon,KeyStroke key)
	{
		super(text);
		super.setOpaque(false);
		if(icon!=null)
			super.setIcon(new ImageIcon(MyJMenuItem.class.getClassLoader().getResource(icon)));
		if(key!=null)
			super.setAccelerator(key);
		this.setIconTextGap(2);
		this.addMouseListener(this);
		super.setFocusPainted(false);
		super.setContentAreaFilled(false);
		this.setContentAreaFilled(false);
	}

	public void paintBorder(Graphics g)
	{
		if(isSelected)
		{
			g.setColor(new Color(96,96,176));
			g.drawRect(0, 0, getWidth()-1, getHeight()-1);
		}
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.white);
		g2.fillRect(0, 0, this.getWidth(), this.getHeight());
		GradientPaint p1 = new GradientPaint(0,0,new Color(200,200,200),getWidth(),0,new Color(60,60,60));
		g2.setPaint(p1);
		g2.fillRect(0, 0, 22, this.getHeight());
		g2.setColor(new Color(60,60,60));
		super.paintComponent(g2);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		isSelected = true;
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		isSelected = false;
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
