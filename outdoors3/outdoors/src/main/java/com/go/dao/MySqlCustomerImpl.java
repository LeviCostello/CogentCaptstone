package com.go.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.go.bo.CustomerBo;

public class MySqlCustomerImpl implements MySqlCustomer{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void dbInsert(CustomerBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}

	@Override
	public void dbDelete(int cid) throws Exception {
		CustomerBo bo = this.hibernateTemplate.load(CustomerBo.class, cid);
		this.hibernateTemplate.delete(bo);
		
	}

	@Override
	public CustomerBo dbSelect(int cid) throws Exception {
		return this.hibernateTemplate.get(CustomerBo.class, cid);
	}

	@Override
	public void dbUpdate(CustomerBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}

}
