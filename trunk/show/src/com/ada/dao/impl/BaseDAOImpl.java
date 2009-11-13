/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: show<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.dao.impl<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-13<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-13        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ada.dao.BaseDAO;

public class BaseDAOImpl extends HibernateDaoSupport implements BaseDAO {
	protected static final Log log = LogFactory.getLog(BaseDAOImpl.class);
	
	public SessionFactory sessionFactory;
	
	@Override
	public Object save(Object obj) {
		return getHibernateTemplate().save(obj);
	}

	@Override
	public void delete(Object obj) {
		getHibernateTemplate().delete(obj);
	}

	@Override
	public void delete(String hql) {
		Session session = this.openSession();
		try {
			session.createQuery(hql).executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List find(String hql) {
		return getHibernateTemplate().find(hql);
	}

	@Override
	public Object findById(Class c, Serializable id) {
		return getHibernateTemplate().get(c, id);
	}

	@Override
	public void saveOrUpdate(Object obj) {
		Session session = this.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(obj);
			session.setFlushMode(FlushMode.AUTO);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}

	@Override
	public void update(Object obj) {

		Session session = this.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(obj);
			session.setFlushMode(FlushMode.AUTO);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}

	// 获得Hibernate中的一个session
	public Session openSession() {
		return SessionFactoryUtils.getSession(getSessionFactory(), true);
	}


	
	@Override
	public double getCount(String hql) {
		Iterator iter = getHibernateTemplate().iterate(hql);
		if (iter != null && iter.hasNext()) {
			Object ob = iter.next();
			if (ob != null) {
				return ((Double) ob).doubleValue();
			} else {
				return 0.0f;
			}
		} else {
			return 0.0f;
		}
	}

	@Override
	public void saveOrUpdateAll(Collection collection) {
		super.getHibernateTemplate().saveOrUpdateAll(collection);
	}

	@Override
	public void add(Object obj) {
		super.getHibernateTemplate().save(obj);
	}

	@Override
	public void deleteAll(Collection collection) {
		super.getHibernateTemplate().deleteAll(collection);
	}

	@Override
	public Object getById(String clazz, Serializable id) {
		return super.getHibernateTemplate().get(clazz, id);
	}

	@Override
	public Long getCountRecord(final String hql) {
		return (Long) super.getHibernateTemplate().execute(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(hql);
						return query.uniqueResult();
					}
				});
	}

	@Override
	public List getList(final String hql) {
		return super.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(hql);
						return query.list();
					}

				});
	}

	
	public int getPageCount(int countOfPage, long record) {

		long count = 0;

		long _count = record % countOfPage;

		if (_count > 0) {
			if (record < countOfPage) {
				count = 1;
			} else {
				count = record / countOfPage + 1;
			}
		} else {
			count = record / countOfPage;
		}
		return Integer.valueOf(String.valueOf(count)) ;
	}

}
