package com.szeye.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.szeye.dto.Result;
import com.szeye.dto.SysUserDto;
import com.szeye.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional(rollbackOn = Exception.class)
public class UserServiceImpl implements UserService {
	
	@Override
	public Object login(SysUserDto obj,HttpServletRequest request) {
		
		Result result = Result.getFailResult("还没有完成");
		SysUserDto user = null;
		
		//TODO
		//登录用户
		
		if("admin".equals(obj.getUsername()) && "123456".equals(obj.getPassword())) {
			request.getSession().setAttribute("user", user);
			result = Result.success("登陆成功");
		}else {
			result = Result.fail("登陆失败");
		}
		
		return result;

	}

	@Override
	public Object logout(Result obj,HttpServletRequest request) {
		
		log.info("Logout");
		
		request.getSession().removeAttribute("user");
		
		return Result.getSuccessResult("退出成功");
		
	}

}
