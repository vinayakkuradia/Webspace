package application.layers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static application.layers.dao.MySQLStatements.*;
import application.exceptions.DaoException;
import application.layers.dao.jdbc.ConnectionFactory;

public class CustomerDaoImpl implements CustomerDao {

	private Connection connectionToDB;
	
	public CustomerDaoImpl() {
		this.connectionToDB = ConnectionFactory.getConnection();
	}

	@Override
	public void addCustomer(Customer customer) {
		try {
			System.out.println("Creating cutomer object...");
			PreparedStatement insertStatement = connectionToDB.prepareStatement("insert into customer (firstname, lastname, address, mobile, email) values (?, ?, ?, ?, ?)");
			insertStatement.setString(1, customer.getFirstname());
			insertStatement.setString(2, customer.getLastname());
			insertStatement.setString(3, customer.getAddress());
			insertStatement.setString(4, customer.getMobile());
			insertStatement.setString(5, customer.getEmail());
			int noOfRowsAffected = insertStatement.executeUpdate();
			System.out.println(noOfRowsAffected + ROWS_AFFECTED);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public Optional<Customer> getCustomerById(int id) {
		System.out.println("Searching customer with id="+id);
		Optional<Customer> requestedCustomerObj = Optional.ofNullable(null);
		try {
			PreparedStatement selectByIdStatement = connectionToDB.prepareStatement(SELECT_FROM_CUSTOMER +WHERE_CUST_ID);
			ResultSet obtainedResultSet =  selectByIdStatement.executeQuery();
			
			obtainedResultSet.next();
			requestedCustomerObj = Optional.ofNullable(new Customer(
						obtainedResultSet.getInt("CustId"), obtainedResultSet.getString("FirstName"),
							obtainedResultSet.getString("LastName"), obtainedResultSet.getString("Address"),
							obtainedResultSet.getString("Mobile"), obtainedResultSet.getString("Email")));
		} catch (SQLException e) {
			throw new DaoException(e.getLocalizedMessage());
		}
		return requestedCustomerObj;
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		System.out.println("Retrieving list of all customers...");
		List<Customer> resultantObjSet = new ArrayList<>();
		try {
			PreparedStatement selectAllStatement = connectionToDB.prepareStatement(SELECT_FROM_CUSTOMER);
			ResultSet obtainedResultSet =  selectAllStatement.executeQuery();
			
			while(obtainedResultSet.next()) {
				resultantObjSet.add(new Customer(obtainedResultSet.getInt("CustId"), obtainedResultSet.getString("FirstName"), obtainedResultSet.getString("LastName"), obtainedResultSet.getString("Address"), obtainedResultSet.getString("Mobile"), obtainedResultSet.getString("Email")));
			}
		} catch (SQLException e) {
			throw new DaoException(e.getLocalizedMessage());
		}
		return resultantObjSet;
	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		try {
			System.out.println("Update operation for id="+id+" started");
			PreparedStatement selectAllStatement = connectionToDB.prepareStatement(UPDATE_CUSTOMER + WHERE_CUST_ID);
			int noOfRowsAffected = selectAllStatement.executeUpdate();
			System.out.println(noOfRowsAffected + ROWS_AFFECTED);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void deleteCustomer(int id) {
		try {
			System.out.println("Delete operation for id="+id+" started");
			PreparedStatement selectAllStatement = connectionToDB.prepareStatement(DELETE_FROM_CUSTOMER + WHERE_CUST_ID);
			int noOfRowsAffected = selectAllStatement.executeUpdate();
			System.out.println(noOfRowsAffected + ROWS_AFFECTED);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
