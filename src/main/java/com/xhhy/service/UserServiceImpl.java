package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhhy.dao.UserDao;
import com.xhhy.domain.UserBean;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
     private UserDao userDao;
	public void insert(UserBean user) {
		userDao.insert(user);
	}

	public List<UserBean> queryAll() {
		
		return userDao.queryAll();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	

}
