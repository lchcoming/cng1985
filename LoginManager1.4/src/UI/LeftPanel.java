package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import entitry.ListItemData;

import UI.Base.BasePanel;
import UI.Base.ListItemRender;

import DataManager.LoginManager;

public class LeftPanel extends BasePanel {

	private JList listType;
	private int selectIndex;
	
	public int getSelectIndex() {
		return selectIndex;
	}
	public LeftPanel(LoginManager loginManager,MainPanel mainPanel)
	{
		super();
		this.loginManager = loginManager;
		this.mainPanel = mainPanel;
		this.setPreferredSize(new Dimension(200,getHeight()));
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		initUI();
	}
	public void initUI()
	{
		this.setTitle("类别管理","image/icoType.gif");
		this.setBackgroundImage("image/listBG.jpg");
		initList();
	}
	private void initList()
	{
		
		listType = new JList();
		listType.setOpaque(false);
		listType.setCellRenderer(new ListItemRender());
		listType.setModel(loginManager.dlm);
		loginManager.updateList();
		JScrollPane scrollPane = new JScrollPane(listType);
		//为了使滚动条面板容器能透出底层容器背景，
		//必须要使滚动条面板背景不重绘，
		//还必须使滚动条面板的视口背景也不重绘
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);//
		this.add(scrollPane,BorderLayout.CENTER);
		listType.addListSelectionListener(new ListSelectionListener(){
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				ListItemData item = (ListItemData)listType.getSelectedValue();
				if(listType.getSelectedIndex()!=-1)
					selectIndex = listType.getSelectedIndex();
				//必须进行空值判断，因为当列表的第一项被指定为选中状态时列表控件尚未被赋加记录
				if(item!=null)
				{
					String txt = item.getTxtTitle();
					loginManager.setCurrType(txt);
					changeTitle(txt+"["+item.getTxtItemCount()+"]",item.getIconURL());
					loginManager.setCurrType(item.getTxtTitle());
					loginManager.updateTable();
					mainPanel.bottomPanel.resetInput();
				}
			}
		});
	}
	
	//更改右侧表格区域的标题
	public void changeTitle(String txt,String icon)
	{
		if(this.mainPanel.rightPanel!=null)
			this.mainPanel.rightPanel.setTitle(txt,icon);
	}
	
	public void setListSelectItem(int item)
	{
		listType.setSelectedIndex(item);
	}
	
	public ListItemData getSelectItem()
	{
		ListItemData item = (ListItemData)listType.getSelectedValue();
		return item;
	}
}
