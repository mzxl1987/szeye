package com.szeye.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class DoctorInfoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8442472005915630644L;
	
	private String hospitalId;
	private String doctorId;
	private String departId;
	private String doctorName;
	private int doctorSex;
	private String doctorRank;
	private String doctorInro;
	private String doctorIntor;
	private int isExpert;
	private int aveWorktime;
	
}
