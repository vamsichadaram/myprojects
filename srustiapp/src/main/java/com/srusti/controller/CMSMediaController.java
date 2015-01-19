package com.srusti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srusti.model.MediaModel;
import com.srusti.service.MediaService;

@Controller
@RequestMapping("/media")
public class CMSMediaController 
{
	@Autowired
	private MediaService service;
	
	@RequestMapping("/form")
	public String mediaform()
	{
		return "mediaform";
	}
	
	@RequestMapping("/form")
	public String save(@ModelAttribute MediaModel model)
	{
		if(model!=null)
		{
			service.save(model);
			return "success";
		}
		else
			return "redirect:form";
	}
}
