package com.szeye.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper=false)
@ToString(callSuper=false)
@Entity
@Table(name="view_getDepartInfo")
public class DepartInfo extends BaseEntity {

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
