package UI.Base;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class MyTableCellRender extends JPanel implements TableCellRenderer {

	private Color bgColor = null;
	private Color fontColor = null;
	private Font font;
	private String text;
	private Image tableCursor = null;
	private boolean isTableCursor = false;
	
	public MyTableCellRender(String fontName,int fontSize,boolean isBold)
	{
		if(isBold)
			font = new Font(fontName,Font.BOLD,fontSize);
		else
			font = new Font(fontName,Font.PLAIN,fontSize);
	}
	
	public MyTableCellRender(Font font)
	{
		this.font = font;
	}
	
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		// TODO Auto-generated method stub
		bgColor = ((row%2)==0)? new Color(250,255,245):new Color(255,255,255);
		if(isSelected)
		{
			bgColor = new Color(220,230,255);
			tableCursor = new ImageIcon(this.getClass().getClassLoader().getResource("image/tableCursor.gif")).getImage();
		}
		else
			tableCursor = null;
		isTableCursor = (column ==0)? true:false;
		text = (String)value.toString();
		return this;
	}
	
	//用于单元格的显示
	public void paintComponent(Graphics g)
	{
		g.setColor(bgColor);
		g.fillRect(0, 0, getWidth(), getHeight());
		if(isTableCursor)//判断此列是否为游标列，游标列将不显示文字
		{
			g.setColor(new Color(183,233,38));
			g.drawRect(0, 0, getWidth()-1, getHeight()-1);
			g.setColor(new Color(255,255,255));
			g.drawRect(1, 1, getWidth()-3, getHeight()-3);
			g.setColor(new Color(234,243,203));
			g.fillRect(2, 2, getWidth()-3, getHeight()-3);
			g.drawImage(tableCursor, 7, (this.getHeight()-15)/2, null);
		}
		else
		{
			g.setColor(new Color(90,90,90));
			g.setFont(font);
			g.drawString(text,font.getSize()/2, (this.getHeight()-font.getSize())/2+font.getSize());
		}
	}
	
}
