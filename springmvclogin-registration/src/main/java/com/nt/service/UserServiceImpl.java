package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.dao.UserDao;
import com.nt.loginbo.Login;
import com.nt.userbo.User;

public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;
	@Override
	public void register(User user) {
		userDao.register(user);
		// TODO Auto-generated method stub
		
	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return userDao.validateUser(login);
	}
	

}
