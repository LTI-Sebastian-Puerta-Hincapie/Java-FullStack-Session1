package com.lti.app;

import com.lti.service.CustomerService;
import com.lti.service.CustomerServiceOperation;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerServiceOperation customerService = new CustomerService();
		
		customerService.createCustomer(0, "Sam", "New York");
		customerService.createCustomer(1, "Jil", "Connecticut");
		customerService.createCustomer(2, "Pete", "New Jersey");
		customerService.createCustomer(3, "Kat", "Virginia");
		customerService.createCustomer(4, "Jon", "Maine");
		
		customerService.updateCustomer(0, "Jen", "California");
		
		customerService.listCustomer();
		
		customerService.deleteCustomer(0);
		
		customerService.listCustomer();
	}
}
