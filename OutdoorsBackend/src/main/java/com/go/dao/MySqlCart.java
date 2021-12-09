package com.go.dao;

import com.go.bo.CartBO;

public interface MySqlCart {
	public void dbInsert(CartBO bo) throws Exception;
	public void dbDelete(int cid) throws Exception;
	public CartBO dbSelect(int cid) throws Exception;
	public void dbUpdate(CartBO bo) throws Exception;
}
