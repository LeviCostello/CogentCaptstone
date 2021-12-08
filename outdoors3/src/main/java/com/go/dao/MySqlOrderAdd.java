package com.go.dao;

import com.go.bo.OrderAddBo;

public interface MySqlOrderAdd {
	public int dbInsert(OrderAddBo bo) throws Exception;
	public int dbDelete(OrderAddBo bo) throws Exception;
	public int dbSelect(OrderAddBo bo) throws Exception;
	public int dbUpdate(OrderAddBo bo) throws Exception;
}
