package application.layers.dao.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectionFactory {
	private static Connection connection;
	
	public static Connection getConnection() {
		InputStream propertiesFileStream = ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
		Properties dbProperties = new Properties();
		
		try {
			dbProperties.load(propertiesFileStream);
		} catch (IOException e) {
			System.out.println();
			e.printStackTrace();
		}
		
		String driver = dbProperties.getProperty("jdbc.driver");
		String dbUrl = dbProperties.getProperty("jdbc.dburl");
		String username = dbProperties.getProperty("jdbc.username");
		String password = dbProperties.getProperty("jdbc.password");
		
		try {
			Class.forName(driver);
			System.out.println("Driver loaded successfully.");
		} catch (ClassNotFoundException e1) {
			System.out.println("Failed to load driver!");
			e1.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection(dbUrl, username, password);
			System.out.println("Connection to database established...");
		} catch (SQLException e) {
			System.out.println("Connection to Database failed!");
			e.printStackTrace();
		} 
		return connection;
	}
}
