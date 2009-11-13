package com.ada.dao;

import java.sql.Timestamp;
import java.util.List;

import com.ada.entity.Blogitem;

/**
 * Interface for BlogitemDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IBlogitemDAO {
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
	 * IBlogitemDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Blogitem entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Blogitem entity);

	/**
	 * Delete a persistent Blogitem entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IBlogitemDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Blogitem entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Blogitem entity);

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
	 * entity = IBlogitemDAO.update(entity);
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
	public Blogitem update(Blogitem entity);

	public Blogitem findById(Integer id);

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
	 *            count of results to return.
	 * @return List<Blogitem> found by query
	 */
	public List<Blogitem> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<Blogitem> findByTitle(Object title, int... rowStartIdxAndCount);

	public List<Blogitem> findByBody(Object body, int... rowStartIdxAndCount);

	public List<Blogitem> findByVisit(Object visit, int... rowStartIdxAndCount);

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
	public List<Blogitem> findAll(int... rowStartIdxAndCount);
}