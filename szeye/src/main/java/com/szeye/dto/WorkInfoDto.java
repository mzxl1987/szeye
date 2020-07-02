package com.szeye.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper=false)
@ToString(callSuper=false)
public class WorkInfoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8442472005915630644L;

	private String doctorId;
	private String departId;
	private BigDecimal workDate;
	private BigDecimal workType;
	private String startTime;
	private String endTime;
	private int totalNum;
	private int leftNum;
	private int checkNum;
	
}
