package com.szeye.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.szeye.dto.Result;
import com.szeye.dto.UserDto;
import com.szeye.entity.User;
import com.szeye.repository.UserRepository;
import com.szeye.service.TestService;

@Service
@Transactional(rollbackOn=Exception.class)
public class TestServiceImpl implements TestService{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserRepository userRepository;
	
	public void saveUser() throws Exception{
		User us = new User();
		us.setId("" + System.nanoTime());
//		us.setUsername("HelloA");
		us.setUsername("HelloA_" + System.nanoTime());
		
		//userRepository.save(us);
		jdbcTemplate.execute("update t_user t set t.username = 'a'");
		
	}
		
	public Object findUsers(String username){
		List<User> users = userRepository.findAllByName(username);
		List<UserDto> dtos = new ArrayList<>();
		
		users.stream().forEach(user -> {
			UserDto ud = new UserDto();
			BeanUtils.copyProperties(user, ud);
			dtos.add(ud);
		});
		
		return Result.getSuccessResult(dtos);
	}

	@Override
	public String readingList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fallbackReadingList() {
		// TODO Auto-generated method stub
		return null;
	}
		
}
