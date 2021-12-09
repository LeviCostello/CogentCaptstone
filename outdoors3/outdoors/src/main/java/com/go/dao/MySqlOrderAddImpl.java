package com.go.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.go.bo.OrderAddBo;

public class MySqlOrderAddImpl implements MySqlOrderAdd{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void dbInsert(OrderAddBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}

	@Override
	public void dbDelete(int oaid) throws Exception {
		OrderAddBo bo = this.hibernateTemplate.load(OrderAddBo.class, oaid);
		this.hibernateTemplate.delete(bo);
		
	}

	@Override
	public OrderAddBo dbSelect(int oaid) throws Exception {
		return this.hibernateTemplate.get(OrderAddBo.class, oaid);
	}

	@Override
	public void dbUpdate(OrderAddBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
	}

}
