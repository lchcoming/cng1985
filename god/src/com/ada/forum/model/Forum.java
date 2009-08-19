package com.ada.forum.model;

import java.util.Set;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Forum {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.UUIDHEX, cacheable = "true")
	private String id;
	@Persistent
	Set<SubForum> subforums;

}
