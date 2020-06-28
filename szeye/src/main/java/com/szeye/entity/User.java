package com.szeye.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper=false)
@ToString(callSuper=false)
@Entity
@Table(name="t_user")
public class User extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8442472005915630644L;

	@Column(unique=false)
	private String username;
	
	@Column
	private String password;
	
	
}
