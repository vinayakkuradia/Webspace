package application.layers.service;

import application.layers.dao.UserDaoImpl;
import application.layers.dao.entity.User;

public class UserServiceImpl implements UserService {

	UserDaoImpl userDaoImpl;
	
	public UserServiceImpl() {
		userDaoImpl = new UserDaoImpl();
	}
	
	@Override
	public User getUser(String username, String password) {
		return userDaoImpl.getUser(username, password);
	}

}
