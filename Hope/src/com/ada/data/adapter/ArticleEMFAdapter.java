package com.ada.data.adapter;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ada.model.Article;
import com.ada.data.manager.EMF;
import com.ada.data.page.PageBean;
import com.ada.data.page.Pager;
import com.helper.PageBeans;
import com.helper.PageResult;

public class ArticleEMFAdapter implements ArticleAdapter {
	public void addArticle(Article art) {
		EntityManager em = EMF.get().createEntityManager();
		try {
			em.persist(art);
		} finally {
			em.close();
		}
	}

	public void updateArticle(Article art) {
		EntityManager em = EMF.get().createEntityManager();
		try {
			long key = art.getId();
			Article f = em.find(Article.class, key);
		} finally {
			em.close();
		}
	}

	public void findArticle(long key) {
		EntityManager em = EMF.get().createEntityManager();
		try {
			Article f = em.find(Article.class, key);

		} finally {
			em.close();
		}
	}

	public void deleteArticle(Article art) {
		EntityManager em = EMF.get().createEntityManager();
		try {
			long key = art.getId();
			Article f = em.find(Article.class, key);
			em.remove(f);
		} finally {
			em.close();
		}
	}

	public List<Article> findArticle(String query) {
		EntityManager em = EMF.get().createEntityManager();
		try {
			List<Article> flights = em.createQuery(query).getResultList();
			// force all results to be pulled back before we close the entity
			// manager
			flights.size();
			return flights;
		} finally {
			em.close();
		}
	}

	public int findsize(String query) {
		return findArticle(query).size();
	}

	public List<Article> pageArticle(String query, int curpage, int pagesize) {
		PageResult result = new PageResult();
		EntityManager em = EMF.get().createEntityManager();
		try {

			Query qu = em.createQuery(query);
			int max = 0;
			int all = 0;
			all = findsize(query);
			max = all / pagesize;
			if (all % pagesize != 0) {
				max = max + 1;
			}
			// �߽��ж�
			if (pagesize < 0) {
				pagesize = 10;
			}
			if (curpage > max) {
				curpage = max;
			}
			if (curpage < 1) {
				curpage = 1;
			}
			int star = (curpage - 1) * pagesize;
			qu.setFirstResult(star);
			qu.setMaxResults(pagesize);
			List<Article> flights = (List<Article>) qu.getResultList();

			// Force all results to be pulled back before we close the entity
			// manager.
			// We could have also called pm.detachCopyAll()
			flights.size();
			return flights;
		} finally {
			em.close();
		}
	}

	// ��ȡ��ҳ����
	public PageResult getPageResult(String hsql, String currentPage,
			String pagerMethod, int pageSize) {
		// ����pager�������ڴ���ҳ��
		int totalRows = 0;
		List resultList = null;
		PageBeans pager = null;
		EntityManager em = EMF.get().createEntityManager();
		Query query = em.createQuery(hsql);
		totalRows = findsize(hsql); // ȡ���ܼ�¼��
		pager = new PageBeans(totalRows, pageSize);

		// ���ǰҳ��Ϊ�գ���ʾΪ�״β�ѯ��ҳ
		// ���Ϊ�գ���ˢ��pager�������뵱ǰҳ�ŵ���Ϣ
		if (currentPage != null) {
			pager.refresh(Integer.parseInt(currentPage));
		}
		// System.out.println("pagerMethod========"+pagerMethod);
		// ��ȡ��ǰִ�еķ�������ҳ��ǰһҳ����һҳ��βҳ��
		if (pagerMethod != null) {
			if (pagerMethod.equals("first")) {
				pager.first();
			} else if (pagerMethod.equals("previous")) {
				pager.previous();
			} else if (pagerMethod.equals("next")) {
				pager.next();
			} else if (pagerMethod.equals("last")) {
				pager.last();
			}
		}
		// �ӵ�ǰҳ��¼��ʼ
		query.setFirstResult(pager.getStartRow());
		// ȡ��pageSize����¼
		query.setMaxResults(pager.getPageSize());

		if (query.getResultList().size() > 0) {
			resultList = query.getResultList();
		}

		// �ѷ�ҳ��ѯ�Ľ��Ͷ������PagerResult��

		if (resultList != null) {
			PageResult pagerResult = new PageResult();
			pagerResult.setPageBean(pager);
			pagerResult.setResultList(resultList);
			return pagerResult;
		} else {
			// System.out.println("resultList================1111111======"+resultList);
			return null;
		}

	}

	public PageBeans getPageBean(String hsql, String currentPage,
			String pagerMethod, int pageSize) {
		int totalRows = 0;
		totalRows = findsize(hsql);
		PageBeans result = new PageBeans(totalRows, pageSize);
		result.setQuery(hsql);
		if (currentPage != null) {
			result.refresh(Integer.parseInt(currentPage));
		}
		if (pagerMethod != null) {
			if (pagerMethod.equals("first")) {
				result.first();
			} else if (pagerMethod.equals("previous")) {
				result.previous();
			} else if (pagerMethod.equals("next")) {
				result.next();
			} else if (pagerMethod.equals("last")) {
				result.last();
			}
		}
		return result;
	}

	public List pageArticle(PageBeans page) {
		return pageArticle(page.getQuery(), page.getCurrentPage(), page
				.getPageSize());
	}

	/**
	 * 
	 * 分页 只有条件一样时候才能正确使用缓存
	 * 
	 * @param hql
	 *            查询条件
	 * @param currentPage
	 *            当前是第几页
	 * @param pageSize
	 *            分页大小
	 * @return
	 */
	public Pager getpage(String hql, int currentPage, int pageSize) {
		int totalRows = 0;
		List resultList = null;
		PageBean pager = null;
		EntityManager em = EMF.get().createEntityManager();
		Query query = em.createQuery(hql);
		//如果缓存中有就从缓存中取数据
		if (temp == null) {
			temp = query.getResultList();
		}

		totalRows = (temp.size()); // 取得总计录数

		pager = new PageBean(pageSize, currentPage, totalRows);
		// 从当前页记录数开始

		// query.setFirstResult((pager.getCurrentPage() - 1) * pageSize);
		// // 取出pageSize个记录
		//
		// query.setMaxResults(pager.getPageSize());
		// if (query.getResultList().size() > 0) {
		// resultList = query.getResultList();
		// }
		// 把分页查询的结果和对象放入PagerResult中
		//分页
		if (temp.size() > 1) {
			resultList = temp.subList(pager.getStartRow(), pager.getEndRow());
		}
		Pager pagerResult = new Pager();
		pagerResult.setPageBean(pager);
		pagerResult.setResultList(resultList);
		if (em.isOpen()) {
			em.close();
		}
		return pagerResult;
	}

	/**
	 * 更新缓存中的内容，当添加新的内容后
	 */
	public static void updateData() {
		EntityManager em = EMF.get().createEntityManager();
		String hql = "select from " + Article.class.getName();
		hql += " order by date desc ";
		Query query = em.createQuery(hql);
		temp = query.getResultList();
		temp.size();
		if (em.isOpen()) {
			em.close();
		}
	}

	private static List temp;
}
