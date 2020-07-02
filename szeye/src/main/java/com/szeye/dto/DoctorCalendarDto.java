package com.szeye.dto;

import java.io.Serializable;
import java.math.BigDecimal;
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
	private BigDecimal workStatus;
	private String doctorId;
	private String departId;
	
	private Date workDate;
	
	private BigDecimal workType;
	private BigDecimal beginNo;
	private BigDecimal spaceNo;
	private BigDecimal limited;
	private BigDecimal registryfee;
	private BigDecimal chinicfee;
	private BigDecimal expertsfee;
	
}
