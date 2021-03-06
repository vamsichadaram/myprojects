package com.srusti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.srusti.model.CustomerModel;
import com.srusti.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
	private CustomerService service;
	
	@RequestMapping("/get")
	public CustomerModel get(@RequestParam("id") int id)
	{
		return service.getCustomer(id);
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save(CustomerModel customer)
	{
		service.save(customer);
	}
	@RequestMapping("/remove")
	public void remove(@RequestParam("id") int id)
	{
		service.remove(id);
	}
	@RequestMapping("/list")
	public List<CustomerModel> list()
	{
		return service.getCustomersList();
	}
}
