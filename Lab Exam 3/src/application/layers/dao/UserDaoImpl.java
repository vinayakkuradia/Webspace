package application.layers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.exceptions.UserNotFoundException;
import application.layers.dao.entity.User;
import application.layers.dao.entity.UserType;
import application.layers.dao.factory.JdbcConnectionFactory;

public class UserDaoImpl implements UserDao {

	Connection connection;

	public UserDaoImpl() {
		this.connection = JdbcConnectionFactory.getConnection();
	}

	@Override
	public User getUser(String username, String password) {
		PreparedStatement preparedStatement;
		System.out.println("Trying to get user");
		User currentUser=null;
		try {
			System.out.println(1);
			preparedStatement = connection.prepareStatement("select * from users where username=? AND password=?");
			preparedStatement.setString(1, username.trim());
			preparedStatement.setString(2, password);
			System.out.println(2);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println(3);
			while (resultSet.next()) {
				currentUser = new User(resultSet.getInt("userId"), resultSet.getString("username"), "",
						UserType.valueOf(resultSet.getString("userType")));
			}
			System.out.println(4);
			System.out.println("** "+currentUser+" **");
		} catch (SQLException e1) {
			throw new UserNotFoundException("User not found");
		}
		return currentUser;
	}

}
