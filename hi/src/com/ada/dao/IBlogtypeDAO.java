package com.ada.dao;

import java.util.List;
import java.util.Set;

import com.ada.entity.Blogtype;

/**
 * Interface for BlogtypeDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IBlogtypeDAO {
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
	 * IBlogtypeDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Blogtype entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Blogtype entity);

	/**
	 * Delete a persistent Blogtype entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IBlogtypeDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Blogtype entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Blogtype entity);

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
	 * entity = IBlogtypeDAO.update(entity);
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
	public Blogtype update(Blogtype entity);

	public Blogtype findById(Integer id);

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
	 *            count of results to return.
	 * @return List<Blogtype> found by query
	 */
	public List<Blogtype> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<Blogtype> findByName(Object name, int... rowStartIdxAndCount);

	public List<Blogtype> findByUpdatetime(Object updatetime,
			int... rowStartIdxAndCount);

	public List<Blogtype> findByMessage(Object message,
			int... rowStartIdxAndCount);

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
	public List<Blogtype> findAll(int... rowStartIdxAndCount);
}