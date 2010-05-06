package DataManager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

import entitry.Login;

public class LoginDAL implements Serializable{
	private String typeName;
	private String iconURL;
	private boolean customIcon;
	public ArrayList<Login> loginArray = new ArrayList<Login>();
	public ArrayList<Login> findArray = null;

	public String getIconURL() {
		return iconURL;
	}

	public void setIconURL(String iconURL) {
		this.iconURL = iconURL;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public LoginDAL(String name,String icon) {
		this.typeName = name;
		this.iconURL = icon;
		this.customIcon = false;
	}
	public LoginDAL(String name)
	{
		this.typeName = name;
		this.iconURL = "image/default.png";
		this.customIcon = false;
	}
	public int getSize()
	{
		return loginArray.size();
	}
	
	public boolean add(Login lm) {
		for (Login l : loginArray) {
			if (lm.equals(l))
				return false;
		}
		loginArray.add(lm);
		return true;
	}

	public void del(int id)
	{
		for(int index = 0;index < loginArray.size();index++)
		{
			Login lm = loginArray.get(index);
			if(lm.getLoginId() == id)
				loginArray.remove(index);
		}
	}
	
	public boolean modify(int id,Login lm)
	{
		for(int index = 0;index < loginArray.size();index++)
		{
			Login l = loginArray.get(index);
			if(l.getLoginId() == id )
			{
				l.setLoginName("");
				l.setLoginUser("");
				l.setLoginPassword("");
				l.setLoginURL("");
				for(int i = 0;i < loginArray.size();i++)
				{
					Login tmp = loginArray.get(i);
					if(tmp.equals(lm))
						return false;
				}
				l.setLoginName(lm.getLoginName());
				l.setLoginUser(lm.getLoginUser());
				l.setLoginPassword(lm.getLoginPassword());
				l.setLoginURL(lm.getLoginURL());
				return true;
			}
		}
		return false;
	}
	
	public void find(String key)
	{
		findArray = new ArrayList<Login>();
		for(int index = 0;index < loginArray.size();index++)
		{
			Login lm = loginArray.get(index);
			if(lm.getLoginName().indexOf(key) >= 0)
			{
				findArray.add(lm);
			}
		}
		if(findArray.size() == 0)
			findArray = null;
	}
	
	public Login get(int index) {
		return loginArray.get(index);
	}

	public boolean isCustomIcon() {
		return customIcon;
	}

	public void setCustomIcon(boolean customIcon) {
		this.customIcon = customIcon;
	}
	
	public Login getById(int id)
	{
		for(Login log : loginArray)
		{
			if(log.getLoginId()==id)
				return log;
		}
		return null;
	}
}
