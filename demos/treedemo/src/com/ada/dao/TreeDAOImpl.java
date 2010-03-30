package com.ada.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ada.entity.Tree;

/**
 * A data access object (DAO) providing persistence and search support for Tree
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.ada.entity.Tree
 * @author MyEclipse Persistence Tools
 */

public class TreeDAOImpl extends HibernateDaoSupport implements TreeDAO {
	private static final Log log = LogFactory.getLog(TreeDAOImpl.class);
	// property constants
	public static final String TREENAME = "treename";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.ada.dao.TreeDAO#save(com.ada.entity.Tree)
	 */
	public void save(Tree transientInstance) {
		log.debug("saving Tree instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.ada.dao.TreeDAO#delete(com.ada.entity.Tree)
	 */
	public void delete(Tree persistentInstance) {
		log.debug("deleting Tree instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.ada.dao.TreeDAO#findById(java.lang.Integer)
	 */
	public Tree findById(java.lang.Integer id) {
		log.debug("getting Tree instance with id: " + id);
		try {
			Tree instance = (Tree) getHibernateTemplate().get(
					"com.ada.entity.Tree", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.ada.dao.TreeDAO#findByExample(com.ada.entity.Tree)
	 */
	public List findByExample(Tree instance) {
		log.debug("finding Tree instance by example");
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

	/* (non-Javadoc)
	 * @see com.ada.dao.TreeDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Tree instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tree as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.ada.dao.TreeDAO#findByTreename(java.lang.Object)
	 */
	public List findByTreename(Object treename) {
		return findByProperty(TREENAME, treename);
	}

	/* (non-Javadoc)
	 * @see com.ada.dao.TreeDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Tree instances");
		try {
			String queryString = "from Tree";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.ada.dao.TreeDAO#merge(com.ada.entity.Tree)
	 */
	public Tree merge(Tree detachedInstance) {
		log.debug("merging Tree instance");
		try {
			Tree result = (Tree) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.ada.dao.TreeDAO#attachDirty(com.ada.entity.Tree)
	 */
	public void attachDirty(Tree instance) {
		log.debug("attaching dirty Tree instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.ada.dao.TreeDAO#attachClean(com.ada.entity.Tree)
	 */
	public void attachClean(Tree instance) {
		log.debug("attaching clean Tree instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TreeDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TreeDAO) ctx.getBean("TreeDAO");
	}
}