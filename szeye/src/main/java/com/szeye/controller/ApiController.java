/**
 * 
 */
package com.szeye.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.szeye.dto.RequestInfoDto;
import com.szeye.dto.YyInfoDto;
import com.szeye.entity.YyInfo;
import com.szeye.service.ApiService;

/**
 * @author LuLu.Zhu
 *
 * 2020年6月28日 下午4:32:53
 */
@RestController
public class ApiController {

	@Autowired
	ApiService apiService;
	
	@GetMapping(value = "getHostInfo")
	public Object getHostInfo(HttpServletRequest request,HttpServletResponse response) {
		return apiService.getHostInfo(request,response);
	}
	
	@GetMapping(value = "getDeptInfo")
	public Object getDeptInfo(HttpServletRequest request,HttpServletResponse response) {
		return apiService.getDeptInfo(request,response);
	}
	
	@GetMapping(value = "getDocInfo")
	public Object getDocInfo(HttpServletRequest request,HttpServletResponse response) {
		return apiService.getDocInfo(request,response);
	}
	
	@GetMapping(value = "getDocWorksInfo")
	public Object getDocWorksInfo(@ModelAttribute RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		return apiService.getDocWorksInfo(obj,request,response);
	}
	
	@GetMapping(value = "getDeptWorksInfo")
	public Object getDeptWorksInfo(@ModelAttribute RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		return apiService.getDeptWorksInfo(obj,request,response);
	}
	
	@GetMapping(value = "getDtNoInfo")
	public Object getDtNoInfo(@ModelAttribute RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		return apiService.getDtNoInfo(obj,request,response);
	}
	
	@GetMapping(value = "getYyNo")
	public Object getYyNo(@ModelAttribute YyInfo obj,HttpServletRequest request,HttpServletResponse response) {
		return apiService.getYyNo(obj,request,response);
	}
	
	@GetMapping(value = "getGhInfo")
	public Object getGhInfo(@ModelAttribute RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		return apiService.getGhInfo(obj,request,response);
	}
	
	@GetMapping(value = "backNo")
	public Object backNo(@ModelAttribute RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		return apiService.backNo(obj,request,response);
	}
	
	@GetMapping(value = "updateOrderInfo")
	public Object updateOrderInfo(@ModelAttribute YyInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		return apiService.updateOrderInfo(obj,request,response);
	}
	
}
