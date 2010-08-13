package com.easycms.common.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao {

	public <T> T add(T t);

	public <T> T delete(Class<T> o,T t);
	public <T> T getById(Class<T> o,Serializable id);
	public <T> List<T> find(String query);
	public <T>  List<T> find(String query,int size);
}
