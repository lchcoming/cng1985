package entitry;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Vector;

public class Login implements Serializable{
	private int loginId;
	private String loginName;
	private String loginUser;
	private String loginPassword;
	private String loginURL;
	
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getLoginURL() {
		return loginURL;
	}
	public void setLoginURL(String loginURL) {
		this.loginURL = loginURL;
	}
	public Login()
	{
		this.loginId = this.hashCode();
	}
	public boolean equals(Object obj)
	{
		if(obj != null && obj instanceof Login)
		{
			Login lm = (Login)obj;
			if((this.loginName.equals(lm.getLoginName()))&&(this.loginUser.equals(lm.getLoginUser())))
				return true;
		}
		return false;
	}
	public Vector toVector()
	{
		Vector v = new Vector();
		v.add(this.loginId);
		v.add(this.loginName);
		v.add(this.loginUser);
		v.add(this.loginPassword);
		v.add(this.loginURL);
		return v;
	}
	public Vector toVectorHidePWD()
	{
		Vector v = new Vector();
		v.add(this.loginId);
		v.add(this.loginName);
		v.add(this.loginUser);
		v.add("* * * * * *");
		v.add(this.loginURL);
		return v;
	}
}
