package com.go.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.go.bo.DeliveryBo;

public class MySqlDeliveryImpl implements MySqlDelivery {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void dbInsert(DeliveryBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
	}

	@Transactional
	public void dbDelete(int did) throws Exception {
		DeliveryBo bo = this.hibernateTemplate.load(DeliveryBo.class, did);
		this.hibernateTemplate.delete(bo);
	}

	public DeliveryBo dbSelect(int did) throws Exception {
		return this.hibernateTemplate.get(DeliveryBo.class, did);
	}

	public void dbUpdate(DeliveryBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}
}
