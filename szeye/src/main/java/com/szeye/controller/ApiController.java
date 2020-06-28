/**
 * 
 */
package com.szeye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public Object getHostInfo() {
		return apiService.getHostInfo();
	}
	
	@GetMapping(value = "getDeptInfo")
	public Object getDeptInfo() {
		return apiService.getDeptInfo();
	}
	
	@GetMapping(value = "getDocInfo")
	public Object getDocInfo() {
		return apiService.getDocInfo();
	}
	
	@GetMapping(value = "getDocWorksInfo")
	public Object getDocWorksInfo() {
		return apiService.getDocWorksInfo();
	}
	
	@GetMapping(value = "getDeptWorksInfo")
	public Object getDeptWorksInfo() {
		return apiService.getDeptWorksInfo();
	}
	
	@GetMapping(value = "getDtNoInfo")
	public Object getDtNoInfo() {
		return apiService.getDtNoInfo();
	}
	
	@GetMapping(value = "getYyNo")
	public Object getYyNo() {
		return apiService.getYyNo();
	}
	
	@GetMapping(value = "getGhInfo")
	public Object getGhInfo() {
		return apiService.getGhInfo();
	}
	
	@GetMapping(value = "backNo")
	public Object backNo() {
		return apiService.backNo();
	}
	
	@GetMapping(value = "updateOrderInfo")
	public Object updateOrderInfo() {
		return apiService.updateOrderInfo();
	}
	
}
