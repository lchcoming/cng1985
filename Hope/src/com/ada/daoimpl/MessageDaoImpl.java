package com.ada.daoimpl;

import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import com.ada.data.manager.PMF;
import com.ada.model.Message;
import com.helper.PageBeans;
import com.helper.PageResult;

public class MessageDaoImpl {
	public void add(Message message) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			pm.makePersistent(message);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

	public int size() {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query query = pm.newQuery(Message.class);
		List<Message> mes = (List<Message>) query.execute();
		int size = mes.size();
		pm.close();
		return size;
	}

	public List<Message> pagework(PageBeans pageBean) {

		pageBean.setTotalRows(size());

		PersistenceManager pm = PMF.get().getPersistenceManager();
		pageBean.config();
		Query query = pm.newQuery(Message.class);
		query.setOrdering("date desc");
		System.out.println(pageBean.getStartRow());
		System.out.println(pageBean.getStartRow()+pageBean.getPageSize());
		query.setRange(pageBean.getStartRow(), pageBean.getPageSize()
				+ pageBean.getStartRow());
		List<Message> mes = (List<Message>) query.execute();
		mes.size();
		return mes;

	}
	
	public void initDate(){
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Extent<Message>  ex=	pm.getExtent(Message.class);
		int i=0;
		for(Message item:ex){
			
			i++;
			if(i>20){
				break;
			}
			pm.deletePersistent(item);
		}
		if(pm.isClosed()){
			pm.close();
		}
	}
}
