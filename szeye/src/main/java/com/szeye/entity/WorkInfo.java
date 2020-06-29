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
public class WorkInfo extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8442472005915630644L;

	private int startTime;
	private int endTime;
	private int totalNum;
	private int leftNum;
	private int checkNum;
	
}
