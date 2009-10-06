package com.gete.sun.entity;

/**
 * ImgsId entity. @author MyEclipse Persistence Tools
 */

public class ImgsId implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String title;
	private String descstr;
	private String demo1;
	private String demo2;
	private String demo3;
	private String demo4;

	// Constructors

	/** default constructor */
	public ImgsId() {
	}

	/** full constructor */
	public ImgsId(String id, String name, String title, String descstr,
			String demo1, String demo2, String demo3, String demo4) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.descstr = descstr;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.demo3 = demo3;
		this.demo4 = demo4;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescstr() {
		return this.descstr;
	}

	public void setDescstr(String descstr) {
		this.descstr = descstr;
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

	public String getDemo3() {
		return this.demo3;
	}

	public void setDemo3(String demo3) {
		this.demo3 = demo3;
	}

	public String getDemo4() {
		return this.demo4;
	}

	public void setDemo4(String demo4) {
		this.demo4 = demo4;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ImgsId))
			return false;
		ImgsId castOther = (ImgsId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getTitle() == castOther.getTitle()) || (this
						.getTitle() != null
						&& castOther.getTitle() != null && this.getTitle()
						.equals(castOther.getTitle())))
				&& ((this.getDescstr() == castOther.getDescstr()) || (this
						.getDescstr() != null
						&& castOther.getDescstr() != null && this.getDescstr()
						.equals(castOther.getDescstr())))
				&& ((this.getDemo1() == castOther.getDemo1()) || (this
						.getDemo1() != null
						&& castOther.getDemo1() != null && this.getDemo1()
						.equals(castOther.getDemo1())))
				&& ((this.getDemo2() == castOther.getDemo2()) || (this
						.getDemo2() != null
						&& castOther.getDemo2() != null && this.getDemo2()
						.equals(castOther.getDemo2())))
				&& ((this.getDemo3() == castOther.getDemo3()) || (this
						.getDemo3() != null
						&& castOther.getDemo3() != null && this.getDemo3()
						.equals(castOther.getDemo3())))
				&& ((this.getDemo4() == castOther.getDemo4()) || (this
						.getDemo4() != null
						&& castOther.getDemo4() != null && this.getDemo4()
						.equals(castOther.getDemo4())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getTitle() == null ? 0 : this.getTitle().hashCode());
		result = 37 * result
				+ (getDescstr() == null ? 0 : this.getDescstr().hashCode());
		result = 37 * result
				+ (getDemo1() == null ? 0 : this.getDemo1().hashCode());
		result = 37 * result
				+ (getDemo2() == null ? 0 : this.getDemo2().hashCode());
		result = 37 * result
				+ (getDemo3() == null ? 0 : this.getDemo3().hashCode());
		result = 37 * result
				+ (getDemo4() == null ? 0 : this.getDemo4().hashCode());
		return result;
	}

}