package com.srusti.dao;

import java.util.List;

import com.srusti.model.Customer;

public interface CustomerDao 
{
	void save(Customer customer);
	void update(Customer customer);
	Customer getCustomer(final int id);
	List<Customer> getCustomersList();
	void remove(final int id);
}
