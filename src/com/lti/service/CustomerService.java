package com.lti.service;

import com.lti.bean.Customer;

public class CustomerService implements CustomerServiceOperation {
	
	//TODO declare an array, add values in create customer, 5 records
	public Customer[] customers = new Customer[5];
	private int index = 0;
	
	public void createCustomer(int id, String name, String address) {
		
		// set customer
		Customer customer = new Customer();
		customer.setCustomerID(id);
		customer.setCustomerName(name);
		customer.setCustomerAddress(address);
		
		// add customer to array
		customers[index] = customer;
		index++;
		System.out.println("Customer was created");
	}
	
	public void updateCustomer(int id, String name, String address) {

		// TODO add logic
		for(int i = 0; i < customers.length; i++) {
			
			if(customers[i].getCustomerID() == id) {
				
				customers[i].setCustomerName(name);
				customers[i].setCustomerAddress(address);
				
				System.out.println("Customer was updated");
			}
		}
	}
	
	public void deleteCustomer(int id) {
		
		// TODO add delete logic - only allowing deletions from the end of the list
		for(int i = 0; i < customers.length; i++) {
			
			if(customers[i].getCustomerID() == id) {
				
				customers[i] = null;
			
			}
		}
		System.out.println("Customer was deleted");
	}
	
	public void listCustomer() {
		
		System.out.println("CUSTOMERS:");
		
		//TODO iterate customer array, create for loop
		for(int i = 0; i < customers.length; i++) {
			
			if(customers[i] != null) {
				System.out.println("==============================");
				System.out.println("ID: " + customers[i].getCustomerID());
				System.out.println("Name: " + customers[i].getCustomerName());
				System.out.println("Address: " + customers[i].getCustomerAddress());
				System.out.println("==============================\n");
			}
		}
	}
}
