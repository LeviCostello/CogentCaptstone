package com.go.dao;

import com.go.bo.UserBo;

public interface MySqlUser {
	public void dbInsert(UserBo bo) throws Exception;
	public void dbDelete(int uid) throws Exception;
	public UserBo dbSelect(int uid) throws Exception;
	public void dbUpdate(UserBo bo) throws Exception;
}
