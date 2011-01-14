package com.ada.shine.core.chain.dbutils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.ResultSetHandler;

public class User implements ResultSetHandler<User>{

	private Integer age;
	private String name;
	public User handle(ResultSet rs) throws SQLException {
		User u=new User();
		return  u;
	}
}
