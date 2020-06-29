package com.szeye.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RequestInfoDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int msgType;
	
	private String hospitalId;
	private String departId;
	private String beginTime;
	private String endTime;
	
	private String doctorId;
	private Date workDate;
	private int workType;
	
	private int id;
	
	private String sickName;
	private int sickSex;
	private int sickInsureType;
	
	private String phone;
	private String cardNo;
	private int payType;
	
}
