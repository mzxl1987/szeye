package com.szeye.service;

public interface TestService {
	
	public String readingList();
	
	public String fallbackReadingList();
	
	public void saveUser() throws Exception;
	
	public Object findUsers(String username);
}
