/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dwr;<br />                             
 * Author��ada.young <br />                  
 * Create Date��  Mar 30, 2010<br />   
 * Modified By��ada.young          <br />                                
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
	 * ���ָ��ID������
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
	 * ���ָ��ID������
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
	 * ���ָ���ڵ�����ж��ӽڵ�
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
	 * ��������
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
	 * ��������
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
	 * �첽���±���
	 * 
	 * @param id
	 * @param title
	 * @return true-�޸ĳɹ� false-�޸�ʧ��
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
	 * ɾ��ָ����һ������
	 * 
	 * @param id
	 */
	public void removeById(Integer id) {
		StringBuffer sql = new StringBuffer("delete from navigate where id = ");
		sql.append(id);
		this.bulkUpdate(sql.toString());
	}

	/**
	 * �첽ɾ�����ݣ�����������ڵ�
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
	 * �ƶ�ָ���ڵ�
	 * 
	 * @param id
	 *            ָ���Ľڵ��id
	 * @param oldParentId
	 *            �ڵ��ƶ�ǰ���ڵĸ��ڵ�
	 * @param newParentId
	 *            �ڵ��ƶ����Ŀ�길�ڵ�
	 * @param nodeIndex
	 *            �ڵ��ƶ����Ŀ��λ��
	 */
	public void ajaxMoveNode(int id, int oldParentId, int newParentId,
			int nodeIndex) {
		Navigate obj = this.get(id);
		int minIndex = obj.getNumber().intValue();
		int maxIndex = nodeIndex;
		if (oldParentId == newParentId && minIndex != maxIndex) {
			// ��ͬһ�����ڵ��·����ƶ�
			if (minIndex < maxIndex) {
				// ��Ҫ�ƶ��Ľڵ�����С��Ҫ�ƶ�����Ŀ����ţ�������
				this.downNode(oldParentId, minIndex, maxIndex);
			} else if (minIndex > maxIndex) {
				// ��Ҫ�ƶ��Ľڵ����Ŵ���Ҫ�ƶ�����Ŀ����ţ�������
				maxIndex = minIndex;
				minIndex = nodeIndex;
				this.upNode(oldParentId, minIndex, maxIndex);
			}
			// �ڵ㱾���������ó�Ҫ�ƶ�����Ŀ�����
			obj.setNumber(nodeIndex);
			this.update(obj);
		}
		if (oldParentId != newParentId) {
			// �ڲ�ͬ���ڵ��·����ƶ�
			// 1���൱��Ҫ�ƶ��Ľڵ���ԭ���ڵ������Ƶ������ɾ���������Ҫָ���ƶ�����ʱ�ڵ����ڵ�λ��
			this.downNode(oldParentId, minIndex, -1);
			// 2���൱��Ҫ�ƶ��Ľڵ����¸��ڵ������Ƶ�ָ����λ�ã������Ҫָ��Ҫ�ƶ�����λ��
			this.upNode(newParentId, maxIndex, -1);
			// �ڵ㱾���������ó�Ҫ�ƶ�����Ŀ�����
			obj.setNumber(nodeIndex);
			obj.setParentId(newParentId);
			this.update(obj);
		}
	}

	/**
	 * ָ���Ľڵ�����
	 * 
	 * @param parentId
	 *            ָ����Χ��Ҫ�ƶ��Ľڵ�ĸ��ڵ�
	 * @param minIndex
	 *            ָ���ڵ��ƶ�����ʱ���ڵ�λ��
	 * @param maxIndex
	 *            ָ���ڵ�Ҫ�ƶ�����Ŀ��λ��
	 */
	@SuppressWarnings("unchecked")
	public void downNode(int parentId, int minIndex, int maxIndex) {
		// ָ���Ľڵ����ƣ���ζ���䷶Χ�ڵĽڵ���Լ�1
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
	 * ָ���Ľڵ�����
	 * 
	 * @param parentId
	 *            ָ����Χ��Ҫ�ƶ��Ľڵ�ĸ��ڵ�
	 * @param minIndex
	 *            ָ���ڵ�Ҫ�ƶ�����Ŀ��λ��
	 * @param maxIndex
	 *            ָ���ڵ��ƶ�����ʱ���ڵ�λ��
	 */
	@SuppressWarnings("unchecked")
	public void upNode(int parentId, int minIndex, int maxIndex) {
		// ָ���Ľڵ����ƣ���ζ���䷶Χ�ڵĽڵ���Լ�1
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
	 * �������»�ɾ������
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
