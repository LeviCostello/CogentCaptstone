package com.go.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.go.bo.OrderBo;
import com.go.bo.UserBo;


public class MySqlOrderImpl  implements MySqlOrder{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void dbInsert(OrderBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}

	@Transactional
	public void dbDelete(int oid) throws Exception {
		OrderBo bo = this.hibernateTemplate.load(OrderBo.class, oid);
		this.hibernateTemplate.delete(bo);
		
	}

	public OrderBo dbSelect(int oid) throws Exception {
		return this.hibernateTemplate.get(OrderBo.class, oid);
	}

	public void dbUpdate(OrderBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}

}
