package com.srusti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srusti.dao.LinkDao;
import com.srusti.model.components.LinkComponent;
import com.srusti.service.LinkService;

@Service("linkService")
public class LinkServiceImpl implements LinkService 
{
	@Autowired
	private LinkDao dao;
	
	public void save(LinkComponent link) 
	{
		dao.save(link);
	}

	public LinkComponent get(int id) 
	{
		return dao.get(id);
	}

	public List<LinkComponent> list() 
	{
		return dao.list();
	}

	public void remove(int id) 
	{
		dao.remove(id);
	}

}
