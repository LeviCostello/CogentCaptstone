package com.go.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.go.bo.CustomerBo;

public class MySqlCustomerImpl implements MySqlCustomer{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void dbInsert(CustomerBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}

	@Transactional
	public void dbDelete(int cid) throws Exception {
		CustomerBo bo = this.hibernateTemplate.load(CustomerBo.class, cid);
		this.hibernateTemplate.delete(bo);
		
	}

	public CustomerBo dbSelect(int cid) throws Exception {
		return this.hibernateTemplate.get(CustomerBo.class, cid);
	}

	public void dbUpdate(CustomerBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}

}
