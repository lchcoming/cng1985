package com.ada.world.model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class City {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	private String name;
	@Persistent
    private Provice provice;
	public City(){
		name="ada";
		
	}
	public Provice getProvice() {
		return provice;
	}
	public void setProvice(Provice provice) {
		this.provice = provice;
	}
	public Key getKey() {
		return key;
	}
	public String getName() {
		return name;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public void setName(String name) {}
}
