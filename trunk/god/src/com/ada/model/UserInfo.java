package com.ada.model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class UserInfo {
	 @PrimaryKey
	    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	    private Long id;

	    @Persistent
	    private ContactInfo contactInfo;
	    @Persistent
	    private String username;
	    @Persistent
	    private String password;
	    public UserInfo(){
	    	username="ada";
	    }
		public ContactInfo getContactInfo() {
			return contactInfo;
		}
		public Long getId() {
			return id;
		}
		public String getPassword() {
			return password;
		}
		public String getUsername() {
			return username;
		}
		public void setContactInfo(ContactInfo contactInfo) {
			this.contactInfo = contactInfo;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public void setUsername(String username) {
			this.username = username;
		}
}
