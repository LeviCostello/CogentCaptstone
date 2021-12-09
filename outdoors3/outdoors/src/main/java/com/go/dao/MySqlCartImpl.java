package com.go.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.go.bo.CartBO;

public class MySqlCartImpl implements MySqlCart{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void dbInsert(CartBO bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}

	@Override
	public void dbDelete(int cid) throws Exception {
		CartBO bo = this.hibernateTemplate.load(CartBO.class, cid);
		this.hibernateTemplate.delete(bo);
		
	}

	@Override
	public CartBO dbSelect(int cid) throws Exception {
		return this.hibernateTemplate.get(CartBO.class, cid);
	}

	@Override
	public void dbUpdate(CartBO bo) throws Exception {
		this.hibernateTemplate.saveOrUpdate(bo);
		
	}
}
