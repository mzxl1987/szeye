package com.szeye.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="t_nav")
@Data
@EqualsAndHashCode(callSuper = false)
public class SysNav extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private String text;
	
	@Column
	private String iconCls;
	
	@Column
	private String rowCls;
	
	@Column
	private String viewType;
	
	@Column
	private String routeId;
	
	@Column
	private boolean leaf;
	
	@Column
	private boolean expanded;

	@Column
	private String parentId;
	
	@Column
	private boolean selectable;
	
	@Transient
	private List<SysNav> children;
	
}
