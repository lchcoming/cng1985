package UI;

import java.awt.*;

import javax.swing.JTextField;

public class RountTextField extends JTextField {
	
	public RountTextField()
	{
		this.setOpaque(false);
	}
	
	public void paintComponent(java.awt.Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		GradientPaint p = new GradientPaint(0,0,new Color(220,230,230),0,getHeight()/2,new Color(255,255,255));
		g2.setPaint(p);
		g2.fillRect(0, 0, getWidth(), getHeight()-2);
		super.paintComponent(g);
	}
	
	public void paintBorder(Graphics g)
	{
		g.setColor(new Color(180,180,180));
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1,3,3);
	}
}
