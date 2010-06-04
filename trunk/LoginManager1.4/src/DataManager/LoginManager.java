package DataManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

import entitry.ListItemData;
import entitry.Login;

public class LoginManager implements Serializable{
	private Map<String,LoginDAL> mapLogin = new HashMap<String,LoginDAL>();
	public ConfigManager configManager;
	private boolean modifyFlag;
	public DefaultTableModel dtm = new DefaultTableModel(){
		public boolean isCellEditable(int row, int column) {
	        return false;
		}
	};
	public DefaultListModel dlm = new DefaultListModel();
	private String currType;
	private String messageText;
	private String fileName;
	public Login selectLogin;
	
	public boolean isModifyFlag() {
		return modifyFlag;
	}

	public void setModifyFlag(boolean modifyFlag) {
		this.modifyFlag = modifyFlag;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public LoginManager(ConfigManager configManager)
	{
		this.configManager = configManager;
		init();
	}
	
	private void init()
	{
		LoginDAL forum = new LoginDAL("论坛", "image/forumicon.png");
		LoginDAL email = new LoginDAL("邮箱", "image/emailicon.png");
		LoginDAL webgame = new LoginDAL("网络游戏", "image/gameicon.png");
		LoginDAL blog = new LoginDAL("个人博客", "image/blogicon.png");
		LoginDAL imsoft = new LoginDAL("即时通讯", "image/imicon.png");
		LoginDAL other = new LoginDAL("其它记录", "image/othericon.png");
		mapLogin.put(other.getTypeName(), other);
		mapLogin.put(webgame.getTypeName(), webgame);
		mapLogin.put(blog.getTypeName(), blog);
		mapLogin.put(imsoft.getTypeName(), imsoft);
		mapLogin.put(email.getTypeName(), email);
		mapLogin.put(forum.getTypeName(), forum);
		modifyFlag = false;
		fileName = "未命名";
	}
	
	public void updateList() {
		dlm.setSize(0);
		for (LoginDAL ld : mapLogin.values()) 
		{
			ListItemData lid = new ListItemData(ld.getTypeName(), ld.getIconURL(), ld.isCustomIcon());
			if(ld.getSize() > 0)
				lid.setTxtItemCount(String.format("现有记录%d条", ld.getSize()));
			lid.setTxtTitle(ld.getTypeName());
			dlm.addElement(lid);
		}
	}
	
	public void updateTable()
	{
		dtm.setRowCount(0);
		LoginDAL currList = mapLogin.get(currType);
		if(currList == null)
			return;
		for(Login lm : currList.loginArray)
		{
			if(this.configManager.isHidePassword())
				dtm.addRow(lm.toVectorHidePWD());
			else
				dtm.addRow(lm.toVector());
		}
	}
	
	public void setCurrType(String text)
	{
		this.currType = text;
	}
	
	public String getCurrType()
	{
		return this.currType;
	}
	
	public String getMessageText()
	{
		return this.messageText;
	}
	
	//根据id号从分类中得到某一条记录对象
	public Login get(int id)
	{
		LoginDAL currList = mapLogin.get(currType);
		if(currList != null){
			return currList.getById(id);
		}
		return null;
	}
	
	public boolean addLogin(Login lm)
	{
		LoginDAL currList = mapLogin.get(currType);
		if(currList.add(lm))
		{
			messageText = "记录添加成功！";
			updateList();
			updateTable();
			this.modifyFlag = true;
			return true;
		}
		else
		{
			messageText = "已有相同的记录名和用户名存在！";
			return false;
		}
	}
	
	public boolean modifyLogin(Login newLogin)
	{
		if(selectLogin == null)
			return false;
		if(newLogin.getLoginName().equals("")||newLogin.getLoginUser().equals("")||newLogin.getLoginPassword().equals(""))
		{
			messageText = "输入的记录数据不完整！";
			return false;
		}
		LoginDAL currList = mapLogin.get(currType);
		if(currList.modify(selectLogin.getLoginId(), newLogin))
		{
			messageText = "记录修改成功！";
			updateList();
			updateTable();
			this.modifyFlag = true;
			return true;
		}
		else
		{
			messageText = "记录修改失败！";
			return false;
		}
	}
	
	public void deleteLogin()
	{
		if(selectLogin == null ||selectLogin.getLoginId()==-1)
			return;
		LoginDAL currList = mapLogin.get(currType);
		currList.del(selectLogin.getLoginId());
		messageText = "记录删除成功！";
		this.modifyFlag = true;
		updateList();
		updateTable();
	}
	
	public void find(String key)
	{
		LoginDAL currList = mapLogin.get(currType);
		currList.find(key);
		if(currList.findArray == null)
			return;
		dtm.setRowCount(0);
		for(Login lm : currList.findArray)
		{
			dtm.addRow(lm.toVector());
		}
	}
	
	public boolean addType(String typeName,String iconUrl,boolean isCustomIcon)
	{
		for(LoginDAL ld : mapLogin.values())
		{
			if(ld.getTypeName().equals(typeName))
			{
				messageText = "已有同名的记录分类存在!";
				return false;
			}
		}
		LoginDAL newType = new LoginDAL(typeName, iconUrl);
		newType.setCustomIcon(isCustomIcon);
		mapLogin.put(newType.getTypeName(), newType);
		messageText = "新记录分类添加成功！";
		this.modifyFlag = true;
		return true;
	}
	
	public boolean modifyType(String typeName,String iconUrl,boolean isCustomIcon)
	{
		LoginDAL newType = mapLogin.get(currType);
		mapLogin.remove(currType);
		for(LoginDAL ld : mapLogin.values())
		{
			if(ld.getTypeName().equals(typeName))
			{
				messageText = "已有同名的记录分类存在!";
				mapLogin.put(newType.getTypeName(), newType);
				return false;
			}
		}
		newType.setTypeName(typeName);
		newType.setIconURL(iconUrl);
		newType.setCustomIcon(isCustomIcon);
		mapLogin.put(newType.getTypeName(), newType);
		messageText = "记录分类修改成功！";
		currType = typeName;
		this.modifyFlag = true;
		return true;
	}
	
	public void deleteType()
	{
		if(currType.equals("") || currType == null)
			return;
		LoginDAL newType = mapLogin.get(currType);
		mapLogin.remove(currType);
		updateList();
		updateTable();
		this.modifyFlag = true;
	}
	
	public boolean saveFile(String file)
	{
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.mapLogin);
			fos.flush();
			fos.close();
			messageText = "文件保存完毕！";
			modifyFlag = false;
			this.fileName = file;
			if(configManager.isOpenLastFile())
				configManager.setLastFileName(this.fileName);
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			messageText = "文件未找到！";
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			messageText = "读写文件时出错！";
			return false;
		}
	}
	
	public boolean openFile(String file) 
	{
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			this.mapLogin = (HashMap)ois.readObject();
			fis.close();
			updateList();
			updateTable();
			modifyFlag = false;
			messageText = "文件载入完毕！";
			this.fileName = file;
			if(configManager.isOpenLastFile())
				configManager.setLastFileName(this.fileName);
			return true;
		} catch (FileNotFoundException e) {
			messageText = "文件未找到！";
//			e.printStackTrace();
			return false;
		} catch (IOException e) {
//			e.printStackTrace();
			messageText = "读写文件时出错！";
			return false;
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			messageText = "数据载入时出错";
			return false;
		} catch (Exception e){
//			e.printStackTrace();
			return false;
		}
	}
	
	public boolean exportFile(String file)
	{
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("登录记录管理器 V1.0\r\n");
			fw.write("\r\n\r\n");
			for(LoginDAL ld : this.mapLogin.values())
			{
				fw.write(ld.getTypeName()+"\r\n");
				fw.write("==========================================\r\n");
				for(Login lm : ld.loginArray)
				{
					fw.write("记录名："+lm.getLoginName()+"\r\n");
					fw.write("用户名："+lm.getLoginUser()+"\r\n");
					fw.write("密　码："+lm.getLoginPassword()+"\r\n");
					fw.write("地　址："+lm.getLoginURL()+"\r\n");
					fw.write("==========================================\r\n");
				}
			}
			fw.flush();
			fw.close();
			messageText = "文件导出成功！";
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			messageText = "文件未找到！";
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			messageText = "读写文件时出错！";
			return false;
		}
	}
	
	public void newFile()
	{
		init();
		updateList();
		updateTable();
	}
}
