package com.helper;
import java.util.List;
/**
 * 分页查询结果类
 * @author 陈海彬 
 * @email chenhaibin@3g.net.cn
 * @create time : 2009-2-12
 */
public class PageResult
{
	/**
	 * 分页结果
	 */
	private List resultList;
	/**
	 * 分页信息
	 */
	private PageBeans pageBean;
	public List getResultList() {
		return resultList;
	}
	public void setResultList(List resultList) {
		this.resultList = resultList;
	}
	public PageBeans getPageBean() {
		return pageBean;
	}
	public void setPageBean(PageBeans pageBean) {
		this.pageBean = pageBean;
	}	
}
