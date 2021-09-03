package application.layers.dao;

import application.layers.dao.entity.User;

public interface UserDao {
	public User getUser(String username, String password);
}
