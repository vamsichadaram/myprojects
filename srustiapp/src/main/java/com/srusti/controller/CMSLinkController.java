package com.srusti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srusti.model.components.LinkComponent;
import com.srusti.service.LinkService;

@Controller
@RequestMapping("/link")
public class CMSLinkController 
{
	@Autowired
	private LinkService service;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save(LinkComponent link)
	{
		service.save(link);
	}
	@RequestMapping("/get")
	public LinkComponent get(int id)
	{
		return service.get(id);
	}
	@RequestMapping("/remove")
	public void remove(int id)
	{
		service.remove(id);
	}
	@RequestMapping("/list")
	public List<LinkComponent> list()
	{
		return service.list();
	}
}
