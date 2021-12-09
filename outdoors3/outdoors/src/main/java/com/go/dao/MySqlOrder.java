package com.go.dao;

import com.go.bo.OrderBo;

public interface MySqlOrder {
	public void dbInsert(OrderBo bo) throws Exception;
	public void dbDelete(int oid) throws Exception;
	public OrderBo dbSelect(int oid) throws Exception;
	public void dbUpdate(OrderBo bo) throws Exception;
}
