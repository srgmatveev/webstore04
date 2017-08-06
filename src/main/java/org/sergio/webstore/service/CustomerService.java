package org.sergio.webstore.service;

import java.util.List;

import org.sergio.webstore.domain.Customer;



public interface CustomerService {
	List <Customer> getAllCustomers();
	void addCustomer(Customer customer);
}
