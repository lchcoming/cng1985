/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: Mweb<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ym.dao;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Apr 9, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Apr 9, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dao;

import java.io.Serializable;
import java.util.List;
import java.util.StringTokenizer;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ada.pager.PageBean;
import com.ada.pager.Pager;
import com.demo.factory.HibernateSessionFactory;

public class BaseDAOImpl {
	private Logger logger = LoggerFactory.getLogger(getClass());

	public Pager getPager(String hql, int currentPage, int pageSize) {
		// 定义pager对象，用于传到页面
		// logger.info("分页开始");
		int totalRows = 0;
		List resultList = null;
		PageBean pager = null;
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		StringTokenizer st = new StringTokenizer(hql);
		while (st.hasMoreTokens()) {
			logger.info(st.nextToken());
		}
		hql = "select count(*)  " + hql;
		Query query2 = session.createQuery(hql);
		if (null != query2) {
			totalRows = Integer.valueOf(query2.list().get(0).toString())
					.intValue(); // 取得总计录数
		}
		logger.info("共有{}条数据", totalRows);
		// totalRows = (query.list()).size(); // 取得总计录数

		pager = new PageBean(pageSize, currentPage, totalRows);
		// 从当前页记录数开始
		logger.info("{}", pager.getStartRow());
		query.setFirstResult(pager.getStartRow());
		// 取出pageSize个记录

		query.setMaxResults(pager.getPageSize());
		if (query.list().size() > 0) {
			resultList = query.list();
		}
		// logger.info("开始》》》》"+pager.getStartPage());
		// logger.info("结束》》》》"+pager.getEndPage());
		// 把分页查询的结果和对象放入PagerResult中

		Pager pagerResult = new Pager();
		pagerResult.setPageBean(pager);
		pagerResult.setResultList(resultList);
		// logger.info("分页成功");
		if (null == pagerResult.getResultList()) {
			logger.warn("没有数据功");
		} else {
			logger.info("从数据库中取到了{}条数据", resultList.size());
		}
		HibernateSessionFactory.closeSession();
		return pagerResult;

	}

	public Object save(Object object) {
		String[] aString = { object.getClass().getName() };
		logger.info("保存类{}的对象{}", aString);
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(object);
		try {
			transaction.commit();
		} catch (Exception e) {
			logger.error("保存数据失败", e);
			transaction.rollback();
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return object;
	}

	public Object delete(Object object) {
		String[] aString = { object.getClass().getName(), ">>>>>>>>>>>>" };
		logger.info("删除类{}的对象{}", aString);
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.delete(object);
		try {
			transaction.commit();
		} catch (Exception e) {
			logger.error("保存数据失败", e);
			transaction.rollback();
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return object;
	}

	public Object update(Object object) {
		String[] aString = { object.getClass().getName(), ">>>>>>>>>>>>" };
		logger.info("更新类{}的对象{}", aString);
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.update(object);
		try {
			transaction.commit();
		} catch (Exception e) {
			logger.error("更新数据失败", e);
			transaction.rollback();
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return object;
	}

	public List<?> findByQuery(String object) {
		// logger.info("删除类{}的对象{}",aString);
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		Query query = session.createQuery(object);
		List<?> temp = null;
		logger.info("Query SQL:{}",query.getQueryString());
		logger.info("返回对象类型{}", query.getReturnTypes());
		logger.info("ReturnAliases:{}", query.getReturnAliases());
		logger.info("NamedParameters:{}", query.getNamedParameters());
		temp = query.list();
		if (temp.size() > 0) {
			Object o = temp.get(0);
			logger.info("返回对象的类名为:{}", o.getClass().getName());
		}
		try {
			transaction.commit();
		} catch (Exception e) {
			logger.error("保存数据失败", e);
			transaction.rollback();
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return temp;
	}

	public Object getObjectById(Serializable object, Serializable id) {
		Object temp = null;
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();

		// object.getClass().getField("id").getInt(object);
		// FieldUtils.readField(FieldUtils.getField(object.getClass(), "id"),
		// object);
		if (object instanceof Class) {
			temp = session.get((Class) object, id);
		} else {
			temp = session.get(object.getClass(), id);
		}

		if (null != temp) {
			logger.info("获取类{}的对象{}", temp);
		} else {
			logger.info("获取对象失败");
		}
		try {
			transaction.commit();
		} catch (Exception e) {
			logger.error("获取数据失败", e);
			transaction.rollback();
		} finally {
			HibernateSessionFactory.closeSession();
		}

		return temp;
	}

	public Object loadObjectById(Serializable object, Serializable id) {
		Object temp = null;
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();

		// object.getClass().getField("id").getInt(object);
		// FieldUtils.readField(FieldUtils.getField(object.getClass(), "id"),
		// object);
		if (object instanceof Class) {
			temp = session.get((Class) object, id);
		} else {
			temp = session.get(object.getClass(), id);
		}

		if (null != temp) {
			logger.info("获取类{}的对象{}", temp);
		} else {
			logger.info("获取对象失败");
		}
		try {
			transaction.commit();
		} catch (Exception e) {
			logger.error("获取数据失败", e);
			transaction.rollback();
		} finally {
			HibernateSessionFactory.closeSession();
		}

		return temp;
	}
}
