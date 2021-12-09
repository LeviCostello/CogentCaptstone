package com.go.dao;

import com.go.bo.DeliveryBo;

public interface MySqlDelivery {
	public void dbInsert(DeliveryBo bo) throws Exception;
	public void dbDelete(int did) throws Exception;
	public DeliveryBo dbSelect(int did) throws Exception;
	public void dbUpdate(DeliveryBo bo) throws Exception;
}
