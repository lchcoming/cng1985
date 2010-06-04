package UI;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import java.awt.*;

import javax.swing.*;

import DataManager.ListItemData;

import java.io.*;

public class ListItemRender extends JPanel implements ListCellRenderer{
	private Font font;
	private String txtTitle;
	private String txtItemCount;
	private Color background;
	private Color frameColor;
	private Image iconImage;
	private Image selectImage;
	private boolean isSelected;

	public ListItemRender() {
		font = new Font("ËÎÌו", Font.BOLD, 12);
		this.setOpaque(true);
	}

	protected void paintComponent(Graphics g) {
		Graphics2D gr = (Graphics2D)g;
//		gr.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT);
		Color txtColor1 = new Color(255,255,255);
		Color txtColor2 = new Color(153,180,255);
		if (isSelected) {
			GradientPaint p = new GradientPaint(0,0,new Color(99, 127, 202),getWidth(),getHeight(),new Color(160, 200, 255));
			gr.setPaint(p);
			gr.fillRoundRect(2, 1, this.getWidth() - 5, this.getHeight() - 2,10,10);
			gr.setColor(new Color(152, 199, 254));
			gr.drawRoundRect(2, 1, this.getWidth() - 5, this.getHeight() - 2,10,10);
			txtColor2 = new Color(0,0,0);
		}
		gr.setColor(txtColor1);
		this.setFont(font);
		gr.drawString(txtTitle, 54, 20);
		gr.setColor(txtColor2);
		gr.drawString(txtItemCount, 54, this.getHeight() - 8);
		if(iconImage!=null)
			gr.drawImage(iconImage, 10, 4, 32, 32, null);
		gr.drawImage(selectImage, getWidth()-30, 8,null);
		gr.dispose();
	}

	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		this.isSelected = isSelected ? true : false;
		ListItemData lab = (ListItemData) value;
		txtTitle = lab.getTxtTitle();
		txtItemCount = lab.getTxtItemCount();
		if(lab.isCustomIcon())
			iconImage = new ImageIcon(lab.getIconURL()).getImage();
		else
			iconImage = new ImageIcon(LeftPanel.class.getClassLoader().getResource(lab.getIconURL())).getImage();
		selectImage = (isSelected) ? new ImageIcon(LeftPanel.class.getClassLoader().getResource("image/listselect.png")).getImage() : null;
		return this;
	}

	public Dimension getPreferredSize() {
		return new Dimension(this.getWidth(), 40);
	}
}
