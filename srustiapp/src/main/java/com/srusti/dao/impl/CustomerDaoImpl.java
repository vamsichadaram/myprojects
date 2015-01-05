package com.srusti.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.srusti.dao.CustomerDao;
import com.srusti.model.Customer;

public class CustomerDaoImpl implements CustomerDao 
{
	private SessionFactory session;
	
	public void save(Customer customer) 
	{
		session.getCurrentSession().save(customer);
	}

	public Customer getCustomer(int id) 
	{
		return (Customer) session.getCurrentSession().get(Customer.class,id);
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getCustomersList() 
	{
		return session.getCurrentSession().createQuery("From Customer").list();
	}

	public void remove(int id) 
	{
		Customer customer=(Customer) session.getCurrentSession().get(Customer.class,id);
		session.getCurrentSession().delete(customer);
	}

}
