package com.szeye.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.szeye.dto.Result;
import com.szeye.dto.SysUserDto;
import com.szeye.service.UserService;

@Controller
//@RequestMapping(path="/")
public class AuthController {

	@Autowired
	UserService userService;
	
	@PostMapping(path="/login")
	@ResponseBody
	public Object login(@ModelAttribute SysUserDto obj,HttpServletRequest request) throws Exception{
		return userService.login(obj,request);
	}
	
	@PostMapping(path="/logout")
	@ResponseBody
	public Object logout(@ModelAttribute Result obj,HttpServletRequest request) throws Exception{
		return userService.logout(obj,request);
	}
	
	@PostMapping(path="/isOk")
	@ResponseBody
	public Object isOk(@ModelAttribute Result obj,HttpServletRequest request) throws Exception{
		return request.getSession().isNew() ? Result.getFailResult("No, not OK") : Result.getSuccessResult("Yes, it's OK！");
	}
	
}
