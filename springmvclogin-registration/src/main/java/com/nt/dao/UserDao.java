package com.nt.dao;

import com.nt.loginbo.Login;
import com.nt.userbo.User;

public interface UserDao {
	void register(User user);
	User validateUser(Login login);

}
