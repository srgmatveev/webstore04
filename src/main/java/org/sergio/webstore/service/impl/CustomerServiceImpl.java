package org.sergio.webstore.service.impl;

import java.util.List;

import org.sergio.webstore.domain.Customer;
import org.sergio.webstore.domain.repository.CustomerRepository;
import org.sergio.webstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.getAllCustomers();
	}

	@Override
	public void addCustomer(Customer customer) {
		customerRepository.addCustomer(customer);

	}

}
