package com.go.dao;

import com.go.bo.ProductBo;

public interface MySqlProduct {
	public int dbInsert(ProductBo bo) throws Exception;
	public int dbDelete(ProductBo bo) throws Exception;
	public int dbSelect(ProductBo bo) throws Exception;
	public int dbUpdate(ProductBo bo) throws Exception;
}
