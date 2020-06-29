package com.szeye.entity;

import java.util.Date;

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
public class DepartCalendar extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8442472005915630644L;
	
	private String hospitalId;
	private int workStatus;
	private String departId;
	private Date workDate;
	private int workType;
	private int beginNo;
	private int spaceNo;
	private int limited;
	private float registryfee;
	private float chinicfee;
	
}
