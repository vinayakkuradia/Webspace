package application.layers.service;

import java.util.List;
import java.util.Optional;

import application.layers.dao.Customer;
import application.layers.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService{

	CustomerDaoImpl customerDaoObject;
	
	public CustomerServiceImpl() {
		this.customerDaoObject = new CustomerDaoImpl();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDaoObject.getAllCustomers();
	}

	@Override
	public void deleteCustomer(int id) {
		customerDaoObject.deleteCustomer(id);
	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		customerDaoObject.updateCustomer(id, customer);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		return customerDaoObject.getCustomerById(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDaoObject.addCustomer(customer);
	}
	
}
