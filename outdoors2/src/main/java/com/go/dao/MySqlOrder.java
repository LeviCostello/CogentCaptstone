package com.go.dao;

import com.go.bo.OrderBo;

public interface MySqlOrder {
	public int dbInsert(OrderBo bo) throws Exception;
	public int dbDelete(OrderBo bo) throws Exception;
	public int dbSelect(OrderBo bo) throws Exception;
	public int dbUpdate(OrderBo bo) throws Exception;
}
