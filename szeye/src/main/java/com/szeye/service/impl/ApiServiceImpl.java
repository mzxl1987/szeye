package com.szeye.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.szeye.dto.RequestInfoDto;
import com.szeye.dto.Result;
import com.szeye.dto.YyInfoDto;
import com.szeye.entity.YyInfo;
import com.szeye.repository.UserRepository;
import com.szeye.service.ApiService;

@Service
@Transactional(rollbackOn=Exception.class)
public class ApiServiceImpl implements ApiService{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Object getHostInfo(HttpServletRequest request,HttpServletResponse response) {
		
		List data = null;
		//TODO
		//获取医院信息
		return Result.getSuccessResult(data);
	}
	
	@Override
	public Object getDeptInfo(HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//获取医院科室信息
		return Result.getSuccessResult(data);
	}
	
	@Override
	public Object getDocInfo(HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//获取医院医生信息
		return Result.getSuccessResult(data);
	}
	
	@Override
	public Object getDocWorksInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//获取医院医生排班信息
		return Result.getSuccessResult(data);
	}
	
	@Override
	public Object getDeptWorksInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//获取医院科室排班信息
		return Result.getSuccessResult(data);
	}
	
	@Override
	public Object getDtNoInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//获取号源信息
		return Result.getSuccessResult(data);
	}
	
	@Override
	public Object getYyNo(YyInfo obj,HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//预约挂号
		return Result.getSuccessResult(data);
	}
	
	@Override
	public Object getGhInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//查询挂号信息
		return Result.getSuccessResult(data);
	}
	
	@Override
	public Object backNo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//退号
		return Result.success(data);
	}
	
	@Override
	public Object updateOrderInfo(YyInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//退号
		return Result.success(data);
	}
	
		
}
