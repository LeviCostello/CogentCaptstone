package com.go.dao;

import com.go.bo.OrderAddBo;

public interface MySqlOrderAdd {
	public void dbInsert(OrderAddBo bo) throws Exception;
	public void dbDelete(int oaid) throws Exception;
	public OrderAddBo dbSelect(int oaid) throws Exception;
	public void dbUpdate(OrderAddBo bo) throws Exception;
}
