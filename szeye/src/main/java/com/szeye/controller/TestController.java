/**
 * 
 */
package com.szeye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.szeye.service.TestService;

/**
 * @author LuLu.Zhu
 *
 * 2020年6月28日 上午11:04:51
 */

@Controller
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping(value = "test",method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "getUsers",method = RequestMethod.GET)
	@ResponseBody
	public Object users() {
		return testService.findUsers(null);
	}
	
}
