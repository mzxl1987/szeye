package com.szeye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.szeye.entity.SysNav;
import com.szeye.service.NavService;

@Controller
@RequestMapping(path="/nav")
public class NavController {

	@Autowired
	NavService navService;
	
	@GetMapping(path="/query")
	@ResponseBody
	public Object query(@ModelAttribute SysNav obj) throws Exception{
		return navService.query();
	}
	
	
}
