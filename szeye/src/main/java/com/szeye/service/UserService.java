package com.szeye.service;

import javax.servlet.http.HttpServletRequest;

import com.szeye.dto.Result;
import com.szeye.dto.SysUserDto;

public interface UserService {
	
	public Object login(SysUserDto obj,HttpServletRequest request);
	public Object logout(Result obj,HttpServletRequest request);
	
}
