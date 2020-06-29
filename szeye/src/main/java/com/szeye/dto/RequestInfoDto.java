package com.szeye.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RequestInfoDto {

	private String hospitalId;
	private String departId;
	private String beginTime;
	private String endTime;
	
	private String doctorId;
	private Date workDate;
	private int workType;
	
}
