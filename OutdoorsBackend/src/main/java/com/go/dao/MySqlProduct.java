package com.go.dao;

import com.go.bo.ProductBo;

public interface MySqlProduct {
	public void dbInsert(ProductBo bo) throws Exception;
	public void dbDelete(int pid) throws Exception;
	public ProductBo dbSelect(int pid) throws Exception;
	public void dbUpdate(ProductBo bo) throws Exception;
}
