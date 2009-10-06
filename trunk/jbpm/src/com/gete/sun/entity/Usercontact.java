package com.gete.sun.entity;

/**
 * Usercontact entity. @author MyEclipse Persistence Tools
 */

public class Usercontact implements java.io.Serializable {

	// Fields

	private String id;
	private Contactgroup contactgroup;
	private User user;
	private String compname;
	private String compaddr;
	private String tel1;
	private String tel2;
	private String mobtel1;
	private String mobtel2;
	private String fax;
	private String qq;
	private String msn;
	private String email;
	private String post;
	private String demo1;
	private String demo2;
	private String photo;
	private String birthday;
	private String demo;
	private String name;

	// Constructors

	/** default constructor */
	public Usercontact() {
	}

	/** minimal constructor */
	public Usercontact(Contactgroup contactgroup, User user, String name) {
		this.contactgroup = contactgroup;
		this.user = user;
		this.name = name;
	}

	/** full constructor */
	public Usercontact(Contactgroup contactgroup, User user, String compname,
			String compaddr, String tel1, String tel2, String mobtel1,
			String mobtel2, String fax, String qq, String msn, String email,
			String post, String demo1, String demo2, String photo,
			String birthday, String demo, String name) {
		this.contactgroup = contactgroup;
		this.user = user;
		this.compname = compname;
		this.compaddr = compaddr;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.mobtel1 = mobtel1;
		this.mobtel2 = mobtel2;
		this.fax = fax;
		this.qq = qq;
		this.msn = msn;
		this.email = email;
		this.post = post;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.photo = photo;
		this.birthday = birthday;
		this.demo = demo;
		this.name = name;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Contactgroup getContactgroup() {
		return this.contactgroup;
	}

	public void setContactgroup(Contactgroup contactgroup) {
		this.contactgroup = contactgroup;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCompname() {
		return this.compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public String getCompaddr() {
		return this.compaddr;
	}

	public void setCompaddr(String compaddr) {
		this.compaddr = compaddr;
	}

	public String getTel1() {
		return this.tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return this.tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getMobtel1() {
		return this.mobtel1;
	}

	public void setMobtel1(String mobtel1) {
		this.mobtel1 = mobtel1;
	}

	public String getMobtel2() {
		return this.mobtel2;
	}

	public void setMobtel2(String mobtel2) {
		this.mobtel2 = mobtel2;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getDemo1() {
		return this.demo1;
	}

	public void setDemo1(String demo1) {
		this.demo1 = demo1;
	}

	public String getDemo2() {
		return this.demo2;
	}

	public void setDemo2(String demo2) {
		this.demo2 = demo2;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getDemo() {
		return this.demo;
	}

	public void setDemo(String demo) {
		this.demo = demo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}