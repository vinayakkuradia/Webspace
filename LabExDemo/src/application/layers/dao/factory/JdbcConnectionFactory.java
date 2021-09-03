package application.layers.dao.factory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConnectionFactory {
	private static Connection connection;
	
	public static Connection getConnection() {
		Properties dbProperties = new Properties();
		try {
			InputStream inputStream = JdbcConnectionFactory.class.getResourceAsStream("db.properties");
			dbProperties.load(inputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String dbUrl = dbProperties.getProperty("jdbc.dbUrl");
		String driverName = dbProperties.getProperty("jdbc.driver");
		String username = dbProperties.getProperty("jdbc.username");
		String password = dbProperties.getProperty("jdbc.password");
		
		try {
			Class.forName(driverName);
			System.out.println("Driver loaded successfully!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection(dbUrl, username, password);
			System.out.println("Connection to database established successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void main(String[] args) {
		Connection connection = JdbcConnectionFactory.getConnection();
	}
}
