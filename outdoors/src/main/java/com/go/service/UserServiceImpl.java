package com.go.service;

import org.springframework.stereotype.Component;

import com.go.bo.UserBo;
import com.go.dao.MySqlUser;

import antlr.collections.List;

@Component
public class UserServiceImpl {
	private MySqlUser user;
	public UserServiceImpl(MySqlUser user) {
		this.user = user;
	}
	public UserBo getUser() throws Exception{
		return user.dbSelect(101);
	}
}
