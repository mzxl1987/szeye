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
public class DepartCalendarDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8442472005915630644L;
	
	private String hospitalId;
	private BigDecimal workStatus;
	private String departId;
	private BigDecimal workDate;
	private BigDecimal workType;
	private String beginNo;
	private String spaceNo;
	private String limited;
	private BigDecimal registryfee;
	private BigDecimal chinicfee;
	
}
