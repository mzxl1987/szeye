package com.szeye.dto;

import java.io.Serializable;
import java.math.BigDecimal;

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
	
	private int departSex;
	private int babyFlag;
	private int babyAge;
	
	private String ksdm;    //科室代码
	private BigDecimal mzks;    //门诊科室
	private String ksxb;    //科室性别
	private String kswz;  //科室位置
	private BigDecimal ghlb;         //挂号类别
	private BigDecimal ghf;        //挂号费
	private BigDecimal zlf;       //诊疗费
	
}
