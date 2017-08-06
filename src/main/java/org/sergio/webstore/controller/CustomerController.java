package org.sergio.webstore.controller;


import org.sergio.webstore.domain.Customer;
import org.sergio.webstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/customers")
	public String customer_list(Model model) {
		model.addAttribute("customers", customerService.getAllCustomers());
		return "customers";

	}


	@RequestMapping(value = "/customers/add", method = RequestMethod.GET)
	public String getAddNewCustomerForm(@ModelAttribute("newCust") Customer newCust) {
		return "addCustomer";
	}

	@RequestMapping(value = "/customers/add", method = RequestMethod.POST)
	public String processAddNewCustomerForm(@ModelAttribute("newCust") Customer customerToBeAdded) {
		
		customerService.addCustomer(customerToBeAdded);
		return "redirect:/customers";
	}


}
