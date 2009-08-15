package com.helper;
import java.util.List;
/**
 * 
 * @author ada
 *
 * @param <T>
 */
public class PageResult<T>
{
	/**
	 * 分页结果
	 */
	private List<T> resultList;
	/**
	 * 分页信息
	 */
	private PageBean pageBean;
	public List<T> getResultList() {
		return resultList;
	}
	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	public PageBean getPageBean() {
		return pageBean;
	}
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}	
}
