package com.xhhy.service;

import java.util.List;

import com.xhhy.domain.UserBean;

public interface UserService {
	public void insert(UserBean user);
    public List<UserBean> queryAll();

}
