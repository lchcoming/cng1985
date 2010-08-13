package com.easycms.common.dao;

import java.io.Serializable;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.easycms.common.util.BeanUtil;
import com.easycms.common.util.PMF;

public  class BaseDaoImpl implements BaseDao {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	public <T> T getById(Class<T> t,Serializable id){
		PersistenceManagerFactory factory = PMF.get();
		PersistenceManager pm = factory.getPersistenceManager();

		T temp=null;
		try {
			temp=	pm.getObjectById( t, id);
		
			logger.info("{}","获取对象结束");
		} catch (Exception e) {
			logger.error("{}","获取对象失败");
		} finally {
			pm.close();
		}
		return temp;
	}
	public <T> T delete(Class<T> o,T t){
		PersistenceManagerFactory factory = PMF.get();
		PersistenceManager pm = factory.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		tx.begin();
		try {
			Object id=null;
			
			id=BeanUtil.<Long>readerByField(t, "id");
			t=pm.getObjectById(o, id);
			pm.deletePersistent(t);
			tx.commit();
			logger.info("{},","删除对象结束");
		} catch (Exception e) {
			if (tx.isActive()) {
				tx.rollback();
			}
			logger.error("{};失败原因:{}","删除对象失败",e.getMessage());
		} finally {
			pm.close();
		}
		return t;
	}
	public <T> T update(T t){
		PersistenceManagerFactory factory = PMF.get();
		PersistenceManager pm = factory.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		tx.begin();
		try {
			Object id=null;
			Class o=t.getClass();
			id=BeanUtil.<Long>readerByField(t, "id");
			T tt=(T) pm.getObjectById(o, id);
			tt=	BeanUtil.copy(t, tt);
			tx.commit();
			logger.info("{}","更新对象结束");
		} catch (Exception e) {
			if (tx.isActive()) {
				tx.rollback();
			}
			logger.error("{}","保存对象失败");
		} finally {
			pm.close();
		}
		return t;
	}
	@Override
	public <T> T add(T t) {
		PersistenceManagerFactory factory = PMF.get();
		PersistenceManager pm = factory.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		tx.begin();
		try {
			pm.makePersistent(t);
			tx.commit();
			logger.info("{}","保存对象结束");
		} catch (Exception e) {
			if (tx.isActive()) {
				tx.rollback();
			}
			logger.error("{}","保存对象失败");
		} finally {
			pm.close();
		}
		return t;
	}
	public <T>  List<T> find(String query,int size) {
		List<T> list = null;
		PersistenceManagerFactory factory = PMF.get();
		PersistenceManager pm = factory.getPersistenceManager();
		try {
			Query qq = pm.newQuery(query);
			qq.setRange(0, size);
			list = (List<T>) qq.execute();
			logger.error("获取了{}个对象", list.size());
		} catch (Exception e) {
			logger.error("查询出错,错误信息{}", e.getMessage());
		} finally {
			pm.close();
		}
		return list;

	}
	public <T> List<T> find(String query) {
		List<T> list = null;
		PersistenceManagerFactory factory = PMF.get();
		PersistenceManager pm = factory.getPersistenceManager();
		try {
			Query qq = pm.newQuery(query);
			list = (List<T>) qq.execute();
			list.size();
		} catch (Exception e) {
			logger.error("查询出错,错误信息{}", e.getMessage());
		} finally {
			pm.close();
		}
		return list;

	}



}
