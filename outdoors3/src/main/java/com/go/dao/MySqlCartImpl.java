package com.go.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.go.bo.CartBO;

public class MySqlCartImpl implements MySqlCart{
	private static final String INSERT_QUERY = "INSERT INTO "
			+ "OUTDOORS.CART_TABLE(cartId, userId, prodId,quantity) "
			+ "VALUES(?,?,?,?)";
	private static final String DELETE_QUERY = "INSERT INTO "
			+ "OUTDOORS.CART_TABLE(cartId, userId, prodId,quantity) "
			+ "VALUES(?,?,?,?)";
	private static final String UPDATE_QUERY = "INSERT INTO "
			+ "OUTDOORS.CART_TABLE(cartId, userId, prodId,quantity) "
			+ "VALUES(?,?,?,?)";
	private static final String SELECT_QUERY = "INSERT INTO "
			+ "OUTDOORS.CART_TABLE(cartId, userId, prodId,quantity) "
			+ "VALUES(?,?,?,?)";
	private DataSource ds;
	public MySqlCartImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int dbInsert(CartBO bo) throws Exception {
		return 0;
	}

	@Override
	public int dbDelete(CartBO bo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int dbSelect(CartBO bo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int dbUpdate(CartBO bo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
