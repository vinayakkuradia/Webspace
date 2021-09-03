package application.layers.dao;

import java.util.*;


public interface CustomerDao {
	public void addCustomer(Customer customer);
	public Optional<Customer> getCustomerById(int id);
	public List<Customer> getAllCustomers();
	public void updateCustomer(int id, Customer customer);
	public void deleteCustomer(int id);	
}
