package com.szeye.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper=false)
@ToString(callSuper=false)
@Entity
@Table(name="t_user")
public class RegInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8442472005915630644L;

	@Id
	private int id;
	private String hospitalId;
	
	private String departId;
	private String doctorId;
	private float selfMoney;
	private float insureMoney;
	private Date getNodate;
	private String isGet;
	private float notPay;
	
}
