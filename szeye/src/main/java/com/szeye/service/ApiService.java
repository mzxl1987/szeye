package com.szeye.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.szeye.dto.RequestInfoDto;
import com.szeye.dto.YyInfoDto;
import com.szeye.entity.YyInfo;

public interface ApiService {
	
	public Object getHostInfo(HttpServletRequest request,HttpServletResponse response);
	public Object getDeptInfo(HttpServletRequest request,HttpServletResponse response);
	public Object getDocInfo(HttpServletRequest request,HttpServletResponse response);
	public Object getDocWorksInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response);
	public Object getDeptWorksInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response);
	public Object getDtNoInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response);
	
	public Object getYyNo(YyInfo obj,HttpServletRequest request,HttpServletResponse response);
	public Object getGhInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response);
	public Object backNo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response);
	public Object updateOrderInfo(YyInfoDto obj,HttpServletRequest request,HttpServletResponse response);
	
	
}
