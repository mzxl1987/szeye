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
@Table(name="view_getHosInfo")
public class DoctorInfo extends BaseEntity {

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
