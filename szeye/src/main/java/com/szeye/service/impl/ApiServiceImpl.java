package com.szeye.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.szeye.dto.Result;
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
	public Object getHostInfo() {
		
		List data = null;
		//TODO
		//获取医院信息
		return Result.success(data);
	}
	
	@Override
	public Object getDeptInfo() {
		List data = null;
		//TODO
		//获取医院科室信息
		return Result.success(data);
	}
	
	@Override
	public Object getDocInfo() {
		List data = null;
		//TODO
		//获取医院医生信息
		return Result.success(data);
	}
	
	@Override
	public Object getDocWorksInfo() {
		List data = null;
		//TODO
		//获取医院医生排班信息
		return Result.success(data);
	}
	
	@Override
	public Object getDeptWorksInfo() {
		List data = null;
		//TODO
		//获取医院科室排班信息
		return Result.success(data);
	}
	
	@Override
	public Object getDtNoInfo() {
		List data = null;
		//TODO
		//获取号源信息
		return Result.success(data);
	}
	
	@Override
	public Object getYyNo() {
		List data = null;
		//TODO
		//预约挂号
		return Result.success(data);
	}
	
	@Override
	public Object getGhInfo() {
		List data = null;
		//TODO
		//查询挂号信息
		return Result.success(data);
	}
	
	@Override
	public Object backNo() {
		List data = null;
		//TODO
		//退号
		return Result.success(data);
	}
	
	@Override
	public Object updateOrderInfo() {
		List data = null;
		//TODO
		//退号
		return Result.success(data);
	}
	
		
}
