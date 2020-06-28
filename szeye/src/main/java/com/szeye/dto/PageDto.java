package com.szeye.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PageDto{
	
	private int start;
	private int limit;
	
}
