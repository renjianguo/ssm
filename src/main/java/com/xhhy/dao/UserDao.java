package com.xhhy.dao;

import java.util.List;

import com.xhhy.domain.UserBean;

public interface UserDao {
	public void insert(UserBean user);
    public List<UserBean> queryAll();
    
}
