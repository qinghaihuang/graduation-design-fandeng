package com.health.service.impl;

import com.health.dao.UserDao;
import com.health.pojo.User;
import com.health.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userdao;

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public boolean login(String username, String password) {
		return userdao.login(username, password);
	}

	public boolean register(User user) {
		Integer ref = (Integer) userdao.save(user);
		if (ref != null)
			return true;
		else
			return false;
	}

}