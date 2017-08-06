package org.sergio.webstore.domain.repository;

import java.util.List;

import org.sergio.webstore.domain.Customer;

public interface CustomerRepository {
	List <Customer> getAllCustomers();
	void addCustomer(Customer customer);
}
