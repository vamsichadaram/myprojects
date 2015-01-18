package com.srusti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srusti.service.BannerService;

@Controller
@RequestMapping("/banner")
public class CMSBannerController 
{
	@Autowired
	private BannerService service;
}
