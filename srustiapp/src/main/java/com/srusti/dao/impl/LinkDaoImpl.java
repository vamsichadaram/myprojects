package com.srusti.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srusti.dao.LinkDao;
import com.srusti.model.components.LinkComponent;

@Repository("linkDao")
public class LinkDaoImpl implements LinkDao 
{
	@Autowired
	private SessionFactory session;
	
	public void save(LinkComponent link) 
	{
		session.getCurrentSession().save(link);
	}

	public LinkComponent get(int id) 
	{
		LinkComponent link=(LinkComponent) session.getCurrentSession().get(LinkComponent.class, id);
		return link;
	}

	@SuppressWarnings("unchecked")
	public List<LinkComponent> list() 
	{
		List<LinkComponent> links=session.getCurrentSession().createQuery("From LinkComponent").list();
		if(links.isEmpty())
		{
			return Collections.EMPTY_LIST;
		}
		return links;
	}

	public void remove(int id) 
	{
		LinkComponent link=(LinkComponent) session.getCurrentSession().get(LinkComponent.class, id);
		session.getCurrentSession().delete(link);
	}

}
