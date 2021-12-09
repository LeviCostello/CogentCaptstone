package com.go.dao;

import com.go.bo.CustomerBo;

public interface MySqlCustomer {
	public void dbInsert(CustomerBo bo) throws Exception;
	public void dbDelete(int cid) throws Exception;
	public CustomerBo dbSelect(int cid) throws Exception;
	public void dbUpdate(CustomerBo bo) throws Exception;
}
