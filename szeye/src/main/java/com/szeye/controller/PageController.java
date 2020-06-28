/**
 * 
 */
package com.szeye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author LuLu.Zhu
 *
 * 2020年6月28日 上午11:04:51
 */

@Controller
public class PageController {

	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
}
