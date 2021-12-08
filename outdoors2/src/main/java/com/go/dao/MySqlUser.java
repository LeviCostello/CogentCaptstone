package com.go.dao;

import com.go.bo.UserBo;

public interface MySqlUser {
	public int dbInsert(UserBo bo) throws Exception;
	public int dbDelete(UserBo bo) throws Exception;
	public int dbSelect(UserBo bo) throws Exception;
	public int dbUpdate(UserBo bo) throws Exception;
}
