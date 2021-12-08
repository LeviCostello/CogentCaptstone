package com.go.dao;

import com.go.bo.CartBO;

public interface MySqlCart {
	public int dbInsert(CartBO bo) throws Exception;
	public int dbDelete(CartBO bo) throws Exception;
	public int dbSelect(CartBO bo) throws Exception;
	public int dbUpdate(CartBO bo) throws Exception;
}
