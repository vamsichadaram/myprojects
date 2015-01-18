package com.srusti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srusti.service.LinkService;

@Controller
@RequestMapping("/link")
public class CMSLinkController 
{
	@Autowired
	private LinkService service;
}
