package com.szeye.dto;

import java.io.Serializable;

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
public class DepartInfoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8442472005915630644L;
	
	private String hospitalId;
	private String departName;
	private String departId;
	private String departIntro;
	private int departType;
	private float registryfee;
	private float clinicfee;
	private String mzks;
	private String departSex;
	private int babyFlag;
	private int babyAge;
	
	
}
