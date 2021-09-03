package application.layers.service;

import application.layers.dao.entity.User;

public interface UserService {
	public User getUser(String username, String password);
}
