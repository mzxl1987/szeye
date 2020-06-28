package com.szeye.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.ToString;

@MappedSuperclass
@Data
@ToString
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length=50,unique=true,nullable=false)
	private String id;
		
//	@JsonSerialize(using=DateToYYYYMMDDHHmmssSerializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=false)
	private Date createDate;
	
//	@JsonSerialize(using=DateToYYYYMMDDHHmmssSerializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	
	private String createBy;
	
	private String updateBy;
	
}
