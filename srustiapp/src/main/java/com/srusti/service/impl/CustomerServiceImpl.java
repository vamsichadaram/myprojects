package com.srusti.service.impl;

import java.util.List;

import com.srusti.dao.CustomerDao;
import com.srusti.model.Customer;
import com.srusti.service.CustomerService;

public class CustomerServiceImpl implements CustomerService 
{
	private CustomerDao dao;
	public void save(Customer customer) 
	{
		dao.save(customer);
	}

	public void update(Customer customer) 
	{
		dao.save(customer);
	}

	public Customer getCustomer(int id) 
	{
		return dao.getCustomer(id);
	}

	public List<Customer> getCustomersList() 
	{
		return dao.getCustomersList();
	}

	public void remove(int id) 
	{
		dao.remove(id);
	}

}
