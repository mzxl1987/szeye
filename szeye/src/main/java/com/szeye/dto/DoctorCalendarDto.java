package com.szeye.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class DoctorCalendarDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8442472005915630644L;
	
	private String hospitalId;
	private int workStatus;
	private String doctorId;
	private String departId;
	private Date workDate;
	private int workType;
	private int beginNo;
	private int spaceNo;
	private int limited;
	private float registryfee;
	private float chinicfee;
	private float expertsfee;
	
}
