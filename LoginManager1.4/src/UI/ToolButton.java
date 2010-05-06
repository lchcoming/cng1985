package UI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class ToolButton extends JButton {
	private Color color1,color2,color3,color4,color5;
	private Color fontColor = new Color(230, 230, 230);
	private boolean mouseOut = true;

	public ToolButton() {
		super();
		this.setContentAreaFilled(false);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setFocusable(false);//如果值为true的话会在按钮文字上出现一个方框影响美观
		this.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				color1 = new Color(255,255,255);
				color2 = new Color(243,248,228);
				color3 = new Color(203,218,156);
				color4 = new Color(241,247,222);
				color5 = new Color(153,203,8);
				mouseOut = false;
				fontColor = new Color(57,85,0);
			}
			public void mouseExited(MouseEvent e) {
				mouseOut = true;
				fontColor = new Color(230, 230, 230);
			}
			public void mousePressed(MouseEvent e) {
				color3 = new Color(255,255,255);
				color4 = new Color(243,248,228);
				color1 = new Color(223,238,176);
				color2 = new Color(241,247,222);
				color5 = new Color(153,203,8);
				mouseOut = false;
				fontColor = new Color(57,85,0);
			}
			public void mouseReleased(MouseEvent e) {
				color1 = new Color(255,255,255);
				color2 = new Color(243,248,228);
				color3 = new Color(203,218,156);
				color4 = new Color(241,247,222);
				color5 = new Color(153,203,8);
				mouseOut = false;
				fontColor = new Color(57,85,0);
			}
		});
	}

	public ToolButton(String text) {
		this();
		this.setText(text);
	}

	protected void paintComponent(Graphics g) {
		if(mouseOut == false)
		{
		Graphics2D g2 = (Graphics2D) g;
		GradientPaint p1 = new GradientPaint(0, 0, color1, 0, getHeight(),
				color2);
		GradientPaint p2 = new GradientPaint(0, 0, color3, 0, getHeight(),
				color4);
		Paint oldPaint = g2.getPaint();
		g2.setPaint(p1);
		g2.fillRect(2, 2, getWidth()-3, getHeight() / 2 -1);
		g2.setPaint(p2);
		g2.fillRect(2, getHeight() / 2, getWidth()-3, getHeight()/2-3);
		g2.setPaint(oldPaint);
		}
		this.setForeground(fontColor);
		super.paintComponent(g);
	}

	protected void paintBorder(Graphics g) {
		if(mouseOut)
			return;
		g.setColor(new Color(0xffffff));
		g.drawRoundRect(2, 2, getWidth()-3, getHeight()-5, 3, 3);
		g.setColor(color5);
		g.drawRoundRect(1, 1, getWidth()-2, getHeight()-4, 3, 3);
	}
}