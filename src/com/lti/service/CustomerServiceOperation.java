/**
 * 
 */
package com.lti.service;

/**
 * @author user106
 *
 */
public interface CustomerServiceOperation {

	public void createCustomer(int id, String name, String address);
	public void updateCustomer(int id, String name, String address);
	public void deleteCustomer(int id);
	public void listCustomer();
}
