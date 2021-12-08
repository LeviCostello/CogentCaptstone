package com.go.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.go.bo.ProductBo;

@Component
public class MySqlProductImpl implements MySqlProduct{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create single object
	@Transactional
	public void dbInsert(ProductBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}

	//delete the single object
	@Transactional
	public void dbDelete(int pid) throws Exception {
		ProductBo bo = this.hibernateTemplate.load(ProductBo.class, pid);
		this.hibernateTemplate.delete(bo);
	}

	//get the single object
	public ProductBo dbSelect(int pid) throws Exception {
		return this.hibernateTemplate.get(ProductBo.class, pid);
	}

	//update a single object
	public void dbUpdate(ProductBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}

}
