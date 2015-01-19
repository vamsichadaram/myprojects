package com.srusti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srusti.dto.MediaForm;
import com.srusti.model.MediaModel;
import com.srusti.service.MediaService;

@Controller
@RequestMapping("/media")
public class MediaController 
{
	@Autowired
	private MediaService service;
	
	@RequestMapping(value="/form")
	public String mediaform()
	{
		return "forms/MediaForm";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save(@ModelAttribute MediaForm mediaForm)
	{
		MediaModel model= new MediaModel();
		model.setName(mediaForm.getName());
		model.setAlt(mediaForm.getAlt());
		model.setDecription(mediaForm.getDecription());
		model.setTitle(mediaForm.getTitle());
		model.setPath("");
		service.save(model);
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
