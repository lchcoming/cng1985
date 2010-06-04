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
		this.setTitle("������","image/icoType.gif");
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
		//Ϊ��ʹ���������������͸���ײ�����������
		//����Ҫʹ��������屳�����ػ棬
		//������ʹ�����������ӿڱ���Ҳ���ػ�
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
				//������п�ֵ�жϣ���Ϊ���б�ĵ�һ�ָ��Ϊѡ��״̬ʱ�б�ؼ���δ�����Ӽ�¼
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
	
	//�����Ҳ�������ı���
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
