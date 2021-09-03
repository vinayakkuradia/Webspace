package application.layers.service;

import java.util.List;
import java.util.Optional;

import application.layers.dao.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomers();
	public void deleteCustomer(int id);
	public void updateCustomer(int id, Customer customer);
	public Optional<Customer> getCustomerById(int id);
	public void addCustomer(Customer customer);
}
