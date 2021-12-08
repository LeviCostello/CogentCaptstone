package com.go.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.go.bo.UserBo;

@Component
public class MySqlUserImpl implements MySqlUser{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create single object
	@Transactional
	public void dbInsert(UserBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
	}
	//delete the single object
	@Transactional
	public void dbDelete(int uid) throws Exception {
		UserBo bo = this.hibernateTemplate.load(UserBo.class, uid);
		this.hibernateTemplate.delete(bo);
	}
	//get the single object
	public UserBo dbSelect(int uid) throws Exception {
		return this.hibernateTemplate.get(UserBo.class, uid);
	}
	//update a single object
	public void dbUpdate(UserBo bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
	}

}
