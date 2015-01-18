package com.srusti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/media")
public class MediaController 
{
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save()
	{
		
	}
	@RequestMapping("/get")
	public void get(int id)
	{
		
	}
	@RequestMapping("/remove")
	public void remove(int id)
	{
		
	}
	@RequestMapping("/list")
	public void list()
	{
		
	}
}
