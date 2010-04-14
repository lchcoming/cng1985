/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.action;<br />                             
 * Author��ada.young <br />                  
 * Create Date��  Apr 13, 2010<br />   
 * Modified By��ada.young          <br />                                
 * Modified Date:Apr 13, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.action;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ada.bulider.TreeHelp;
import com.ada.bulider.TreesHelp;
import com.ada.dao.BaseDAOImpl;
import com.ada.entity.CailiaoZiyuan;
import com.ada.entity.CailiaoZiyuanType;

public class TypeAction {
	private Logger logger = LoggerFactory.getLogger(getClass());

	private String id;

	private BaseDAOImpl dao;
	private String treess;
	private TreeHelp help;
	private List<CailiaoZiyuanType> types;
	private CailiaoZiyuanType type;

	public CailiaoZiyuanType getType() {
		return type;
	}

	public void setType(CailiaoZiyuanType type) {
		this.type = type;
	}

	public TypeAction() {
		dao = new BaseDAOImpl();
		help = new TreeHelp();
	}

	public BaseDAOImpl getDao() {
		return dao;
	}

	public String getId() {
		return id;
	}

	// 返回该节点的所有子节点的信息
	public String makeMore() {
		String hql = "from CailiaoZiyuanType type where type.cailiaoZiyuanType.cailiaoTypeId = '"
				+ id + "'";
		logger.info("<<<<<<{}>>>>>>>>>", hql);
		logger.info(hql);
		types = (List<CailiaoZiyuanType>) dao.findByQuery(hql);
		return "success";
	}

	// 返回该节点的信息
	public String makeOne() {
		type = (CailiaoZiyuanType) dao.getObjectById(CailiaoZiyuanType.class,
				id);
		return "success";
	}

	public String getTreess() {

		return treess;
	}

	public List<CailiaoZiyuanType> getTypes() {
		return types;
	}

	public void setDao(BaseDAOImpl dao) {
		this.dao = dao;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTreess(String treess) {
		this.treess = treess;
	}

	public void setTypes(List<CailiaoZiyuanType> types) {
		this.types = types;
	}

	public String tree() {
		String hql = "from CailiaoZiyuanType type where type.cailiaoZiyuanType.cailiaoTypeId = '"
				+ id + "'";
		logger.info("ff{}ff", hql);
		logger.info(hql);
		String hql1="from CailiaoZiyuan type where type.cailiaoTypeId= '"
			+ id + "'";
		List<CailiaoZiyuanType> temp = (List<CailiaoZiyuanType>) dao
				.findByQuery(hql);
		List<CailiaoZiyuan> ziyuans=(List<CailiaoZiyuan> )dao.findByQuery(hql1);
		//treess = help.makeTree(temp);
		TreesHelp h=new TreesHelp();
		treess=h.makeTree(temp, ziyuans);
		return "success";
	}

	public String work() {
		return "success";
	}
}
