package com.ada.entity;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Navigate entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ada.entity.Navigate
 * @author MyEclipse Persistence Tools
 */

public class NavigateDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(NavigateDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String NUMBER = "number";
	public static final String LEAF = "leaf";
	public static final String URL = "url";

	protected void initDao() {
		// do nothing
	}

	public void save(Navigate transientInstance) {
		log.debug("saving Navigate instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Navigate persistentInstance) {
		log.debug("deleting Navigate instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Navigate findById(java.lang.Integer id) {
		log.debug("getting Navigate instance with id: " + id);
		try {
			Navigate instance = (Navigate) getHibernateTemplate().get(
					"com.ada.entity.Navigate", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Navigate instance) {
		log.debug("finding Navigate instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Navigate instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Navigate as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByNumber(Object number) {
		return findByProperty(NUMBER, number);
	}

	public List findByLeaf(Object leaf) {
		return findByProperty(LEAF, leaf);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findAll() {
		log.debug("finding all Navigate instances");
		try {
			String queryString = "from Navigate";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Navigate merge(Navigate detachedInstance) {
		log.debug("merging Navigate instance");
		try {
			Navigate result = (Navigate) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Navigate instance) {
		log.debug("attaching dirty Navigate instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Navigate instance) {
		log.debug("attaching clean Navigate instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static NavigateDAO getFromApplicationContext(ApplicationContext ctx) {
		return (NavigateDAO) ctx.getBean("NavigateDAO");
	}
}