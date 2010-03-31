/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dwr;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Mar 30, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Mar 30, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dtree.demo;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ada.dwr.DBConn;
import com.ada.dwr.Navigate;


public class NavigateDao {
	private static NavigateDao dao;

	NavigateDao() {
	}

	public static NavigateDao getInstanece() {
		if (null == dao) {
			dao = new NavigateDao();
		}
		return dao;
	}

	/**
	 * 获得指定ID的数据
	 * 
	 * @param id
	 * @return
	 */
	public Navigate get(Serializable id) {
		Connection conection = null;
		Statement stmt = null;
		ResultSet rs = null;
		Navigate obj = null;
		try {
			conection = DBConn.getConnection();
			stmt = conection.createStatement();
			StringBuffer sql = new StringBuffer(
					"select * from navigate where id = ");
			sql.append(id);
			rs = stmt.executeQuery(sql.toString());
			if (rs.next()) {
				obj = new Navigate();
				obj.setId(rs.getInt("id"));
				obj.setLeaf(rs.getInt("leaf"));
				obj.setNumber(rs.getInt("number"));
				obj.setParentId(rs.getInt("parentId"));
				obj.setTitle(rs.getString("title"));
				obj.setUrl(rs.getString("url"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
					}
					rs = null;
				}
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException sqlex) {
					}
					stmt = null;
				}
				if (conection != null) {
					try {
						conection.close();
					} catch (SQLException sqlex) {
					}
					conection = null;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return obj;
	}
	/**
	 * 获得指定ID的数据
	 * 
	 * @param id
	 * @return
	 */
	public List<Navigate> listall() {
		Connection conection = null;
		Statement stmt = null;
		ResultSet rs = null;
		Navigate obj = null;
		List<Navigate> lists=new ArrayList<Navigate>();
		try {
			conection = DBConn.getConnection();
			stmt = conection.createStatement();
			StringBuffer sql = new StringBuffer(
					"SELECT * FROM navigate");
			
			rs = stmt.executeQuery(sql.toString());
			
			while (rs.next()) {
				obj = new Navigate();
				obj.setId(rs.getInt("id"));
				obj.setLeaf(rs.getInt("leaf"));
				obj.setNumber(rs.getInt("number"));
				obj.setParentId(rs.getInt("parentId"));
				obj.setTitle(rs.getString("title"));
				obj.setUrl(rs.getString("url"));
				lists.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
					}
					rs = null;
				}
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException sqlex) {
					}
					stmt = null;
				}
				if (conection != null) {
					try {
						conection.close();
					} catch (SQLException sqlex) {
					}
					conection = null;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return lists;
	}

	/**
	 * 获得指定节点的所有儿子节点
	 * 
	 * @param id
	 */
	@SuppressWarnings("unchecked")
	public List<Navigate> getChildrenById(Integer id) {
		List<Navigate> list = new ArrayList<Navigate>();
		Connection conection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conection = DBConn.getConnection();
			stmt = conection.createStatement();
			StringBuffer sql = new StringBuffer(
					"select * from navigate where parentId = ");
			sql.append(id);
			sql.append(" order by number,id");
			rs = stmt.executeQuery(sql.toString());
			while (rs.next()) {
				Navigate obj = new Navigate();
				obj.setId(rs.getInt("id"));
				obj.setLeaf(rs.getInt("leaf"));
				obj.setNumber(rs.getInt("number"));
				obj.setParentId(rs.getInt("parentId"));
				obj.setTitle(rs.getString("title"));
				obj.setUrl(rs.getString("url"));
				list.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
					}
					rs = null;
				}
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException sqlex) {
					}
					stmt = null;
				}
				if (conection != null) {
					try {
						conection.close();
					} catch (SQLException sqlex) {
					}
					conection = null;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * 保存数据
	 * 
	 * @param obj
	 */
	public void save(Navigate obj) {
		StringBuffer sql = new StringBuffer(
				"insert into navigate(parentId,title,leaf,number,url) values(");
		sql.append(obj.getParentId());
		sql.append(",'");
		sql.append(obj.getTitle());
		sql.append("',");
		sql.append(obj.getLeaf());
		sql.append(",");
		sql.append(obj.getNumber());
		sql.append(",'");
		sql.append(obj.getUrl());
		sql.append("')");
		this.bulkUpdate(sql.toString());
	}

	/**
	 * 更新数据
	 * 
	 * @param obj
	 */
	public void update(Navigate obj) {
		StringBuffer sql = new StringBuffer("update navigate set");
		sql.append(" parentId = ");
		sql.append(obj.getParentId());
		sql.append(",");
		sql.append(" title = '");
		sql.append(obj.getTitle());
		sql.append("',");
		sql.append(" leaf = ");
		sql.append(obj.getLeaf());
		sql.append(",");
		sql.append(" number = ");
		sql.append(obj.getNumber());
		sql.append(", url = '");
		sql.append(obj.getUrl());
		sql.append("' where id = ");
		sql.append(obj.getId());
		this.bulkUpdate(sql.toString());
	}

	/**
	 * 异步更新标题
	 * 
	 * @param id
	 * @param title
	 * @return true-修改成功 false-修改失败
	 */
	public Boolean ajaxUpdateTitle(Integer id, String title) {
		Boolean flag = false;
		Navigate obj = this.get(id);
		if (null != obj) {
			StringBuffer sql = new StringBuffer("update navigate set");
			sql.append(" title = '");
			sql.append(title);
			sql.append("'");
			sql.append(" where id = ");
			sql.append(id);
			this.bulkUpdate(sql.toString());
			flag = true;
		}
		return flag;
	}

	/**
	 * 删除指定的一条数据
	 * 
	 * @param id
	 */
	public void removeById(Integer id) {
		StringBuffer sql = new StringBuffer("delete from navigate where id = ");
		sql.append(id);
		this.bulkUpdate(sql.toString());
	}

	/**
	 * 异步删除数据，包括其子孙节点
	 * 
	 * @param id
	 * @param title
	 */
	@SuppressWarnings("unchecked")
	public void ajaxRemoveNode(Integer id) {
		List list = this.getChildrenById(id);
		for (Object object : list) {
			Navigate obj = (Navigate) object;
			ajaxRemoveNode(obj.getId());
		}
		this.removeById(id);
	}

	/**
	 * 移动指定节点
	 * 
	 * @param id
	 *            指定的节点的id
	 * @param oldParentId
	 *            节点移动前所在的父节点
	 * @param newParentId
	 *            节点移动后的目标父节点
	 * @param nodeIndex
	 *            节点移动后的目标位置
	 */
	public void ajaxMoveNode(int id, int oldParentId, int newParentId,
			int nodeIndex) {
		Navigate obj = this.get(id);
		int minIndex = obj.getNumber().intValue();
		int maxIndex = nodeIndex;
		if (oldParentId == newParentId && minIndex != maxIndex) {
			// 在同一个父节点下发生移动
			if (minIndex < maxIndex) {
				// 当要移动的节点的序号小于要移动到的目标序号，则下移
				this.downNode(oldParentId, minIndex, maxIndex);
			} else if (minIndex > maxIndex) {
				// 当要移动的节点的序号大于要移动到的目标序号，则上移
				maxIndex = minIndex;
				minIndex = nodeIndex;
				this.upNode(oldParentId, minIndex, maxIndex);
			}
			// 节点本身的序号设置成要移动到的目标序号
			obj.setNumber(nodeIndex);
			this.update(obj);
		}
		if (oldParentId != newParentId) {
			// 在不同父节点下发生移动
			// 1、相当于要移动的节点在原父节点下下移到最后再删除掉，因此要指定移动发生时节点所在的位置
			this.downNode(oldParentId, minIndex, -1);
			// 2、相当于要移动的节点在新父节点下上移到指定的位置，因此需要指定要移动到的位置
			this.upNode(newParentId, maxIndex, -1);
			// 节点本身的序号设置成要移动到的目标序号
			obj.setNumber(nodeIndex);
			obj.setParentId(newParentId);
			this.update(obj);
		}
	}

	/**
	 * 指定的节点下移
	 * 
	 * @param parentId
	 *            指定范围内要移动的节点的父节点
	 * @param minIndex
	 *            指定节点移动发生时所在的位置
	 * @param maxIndex
	 *            指定节点要移动到的目标位置
	 */
	@SuppressWarnings("unchecked")
	public void downNode(int parentId, int minIndex, int maxIndex) {
		// 指定的节点下移，意味着其范围内的节点各自减1
		StringBuffer sql = new StringBuffer(
				"update navigate set number=number-1 where parentId = ");
		sql.append(parentId);
		if (maxIndex != -1) {
			sql.append(" and number <= ");
			sql.append(maxIndex);
		}
		if (minIndex != -1) {
			sql.append(" and number > ");
			sql.append(minIndex);
		}
		this.bulkUpdate(sql.toString());
	}

	/**
	 * 指定的节点上移
	 * 
	 * @param parentId
	 *            指定范围内要移动的节点的父节点
	 * @param minIndex
	 *            指定节点要移动到的目标位置
	 * @param maxIndex
	 *            指定节点移动发生时所在的位置
	 */
	@SuppressWarnings("unchecked")
	public void upNode(int parentId, int minIndex, int maxIndex) {
		// 指定的节点上移，意味着其范围内的节点各自加1
		StringBuffer sql = new StringBuffer(
				"update navigate set number=number+1 where parentId = ");
		sql.append(parentId);
		if (maxIndex != -1) {
			sql.append(" and number < ");
			sql.append(maxIndex);
		}
		if (minIndex != -1) {
			sql.append(" and number >= ");
			sql.append(minIndex);
		}
		this.bulkUpdate(sql.toString());
	}

	/**
	 * 批量更新或删除操作
	 * 
	 * @param sql
	 */
	public void bulkUpdate(String sql) {
		Connection conection = null;
		Statement stmt = null;
		try {
			conection = DBConn.getConnection();
			stmt = conection.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException sqlex) {
					}
					stmt = null;
				}
				if (conection != null) {
					try {
						conection.close();
					} catch (SQLException sqlex) {
					}
					conection = null;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
