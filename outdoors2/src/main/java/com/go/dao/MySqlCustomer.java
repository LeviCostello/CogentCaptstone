package com.go.dao;

import com.go.bo.CustomerBo;

public interface MySqlCustomer {
	public int dbInsert(CustomerBo bo) throws Exception;
	public int dbDelete(CustomerBo bo) throws Exception;
	public int dbSelect(CustomerBo bo) throws Exception;
	public int dbUpdate(CustomerBo bo) throws Exception;
}
