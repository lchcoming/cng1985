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
	private PageBean pageBean;
	public List getResultList() {
		return resultList;
	}
	public void setResultList(List resultList) {
		this.resultList = resultList;
	}
	public PageBean getPageBean() {
		return pageBean;
	}
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}	
}
