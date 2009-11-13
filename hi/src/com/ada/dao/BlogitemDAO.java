package com.ada.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ada.entity.Blogitem;

/**
 * A data access object (DAO) providing persistence and search support for
 * Blogitem entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see com.ada.dao.Blogitem
 * @author MyEclipse Persistence Tools
 */

public class BlogitemDAO implements IBlogitemDAO {
	// property constants
	public static final String TITLE = "title";
	public static final String BODY = "body";
	public static final String VISIT = "visit";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved Blogitem entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * BlogitemDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Blogitem entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Blogitem entity) {
		EntityManagerHelper.log("saving Blogitem instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent Blogitem entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * BlogitemDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Blogitem entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Blogitem entity) {
		EntityManagerHelper.log("deleting Blogitem instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(Blogitem.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Blogitem entity and return it or a copy of it
	 * to the sender. A copy of the Blogitem entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = BlogitemDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Blogitem entity to update
	 * @return Blogitem the persisted Blogitem entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Blogitem update(Blogitem entity) {
		EntityManagerHelper.log("updating Blogitem instance", Level.INFO, null);
		try {
			Blogitem result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Blogitem findById(Integer id) {
		EntityManagerHelper.log("finding Blogitem instance with id: " + id,
				Level.INFO, null);
		try {
			Blogitem instance = getEntityManager().find(Blogitem.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Blogitem entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Blogitem property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<Blogitem> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Blogitem> findByProperty(String propertyName,
			final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding Blogitem instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Blogitem model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}

	public List<Blogitem> findByTitle(Object title, int... rowStartIdxAndCount) {
		return findByProperty(TITLE, title, rowStartIdxAndCount);
	}

	public List<Blogitem> findByBody(Object body, int... rowStartIdxAndCount) {
		return findByProperty(BODY, body, rowStartIdxAndCount);
	}

	public List<Blogitem> findByVisit(Object visit, int... rowStartIdxAndCount) {
		return findByProperty(VISIT, visit, rowStartIdxAndCount);
	}

	/**
	 * Find all Blogitem entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Blogitem> all Blogitem entities
	 */
	@SuppressWarnings("unchecked")
	public List<Blogitem> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all Blogitem instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from Blogitem model";
			Query query = getEntityManager().createQuery(queryString);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}