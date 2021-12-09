package com.go.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.go.bo.DeliveryBo;

public class MySqlDeliveryImpl implements MySqlDelivery {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void dbInsert(DeliveryBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
	}

	@Override
	public void dbDelete(int did) throws Exception {
		DeliveryBo bo = this.hibernateTemplate.load(DeliveryBo.class, did);
		this.hibernateTemplate.delete(bo);
	}

	@Override
	public DeliveryBo dbSelect(int did) throws Exception {
		return this.hibernateTemplate.get(DeliveryBo.class, did);
	}

	@Override
	public void dbUpdate(DeliveryBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}
}
