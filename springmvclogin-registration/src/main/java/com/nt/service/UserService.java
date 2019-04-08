package com.nt.service;

import com.nt.loginbo.Login;
import com.nt.userbo.User;

public interface UserService {
	void register(User user);
	User validateUser(Login login);

}
