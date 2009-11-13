package com.ada.dao;

import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ada.entity.Blogtype;

/**
 * A data access object (DAO) providing persistence and search support for
 * Blogtype entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see com.ada.dao.Blogtype
 * @author MyEclipse Persistence Tools
 */

public class BlogtypeDAO implements IBlogtypeDAO {
	// property constants
	public static final String NAME = "name";
	public static final String UPDATETIME = "updatetime";
	public static final String MESSAGE = "message";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved Blogtype entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * BlogtypeDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Blogtype entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Blogtype entity) {
		EntityManagerHelper.log("saving Blogtype instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent Blogtype entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * BlogtypeDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Blogtype entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Blogtype entity) {
		EntityManagerHelper.log("deleting Blogtype instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(Blogtype.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Blogtype entity and return it or a copy of it
	 * to the sender. A copy of the Blogtype entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = BlogtypeDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Blogtype entity to update
	 * @return Blogtype the persisted Blogtype entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Blogtype update(Blogtype entity) {
		EntityManagerHelper.log("updating Blogtype instance", Level.INFO, null);
		try {
			Blogtype result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Blogtype findById(Integer id) {
		EntityManagerHelper.log("finding Blogtype instance with id: " + id,
				Level.INFO, null);
		try {
			Blogtype instance = getEntityManager().find(Blogtype.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Blogtype entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Blogtype property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<Blogtype> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Blogtype> findByProperty(String propertyName,
			final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding Blogtype instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Blogtype model where model."
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

	public List<Blogtype> findByName(Object name, int... rowStartIdxAndCount) {
		return findByProperty(NAME, name, rowStartIdxAndCount);
	}

	public List<Blogtype> findByUpdatetime(Object updatetime,
			int... rowStartIdxAndCount) {
		return findByProperty(UPDATETIME, updatetime, rowStartIdxAndCount);
	}

	public List<Blogtype> findByMessage(Object message,
			int... rowStartIdxAndCount) {
		return findByProperty(MESSAGE, message, rowStartIdxAndCount);
	}

	/**
	 * Find all Blogtype entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Blogtype> all Blogtype entities
	 */
	@SuppressWarnings("unchecked")
	public List<Blogtype> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all Blogtype instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from Blogtype model";
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