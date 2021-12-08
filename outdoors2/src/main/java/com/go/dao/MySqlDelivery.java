package com.go.dao;

import com.go.bo.DeliveryBo;

public interface MySqlDelivery {
	public int dbInsert(DeliveryBo bo) throws Exception;
	public int dbDelete(DeliveryBo bo) throws Exception;
	public int dbSelect(DeliveryBo bo) throws Exception;
	public int dbUpdate(DeliveryBo bo) throws Exception;
}
