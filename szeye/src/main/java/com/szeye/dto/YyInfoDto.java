package com.szeye.dto;

import java.io.Serializable;
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
public class YyInfoDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8442472005915630644L;

	private String hospitalId;
	private String departId;
	private String departName;
	private String doctorId;
	private String doctorName;
	private int isExpert;
	private String sickName;
	private int sickSex;
	private Date sickBirthday;
	private int sickInsureType;
	private String sickInsureNo;
	private Date seeDoctorDate;
	private int workType;
	private String reserveNo;
	private float registryfee;
	private float clinicfee;
	private float expertsfee;
	private String checkNo;
	private String phone;
	private String cardNo;
	private int regType;
	private int payType;
	private int mzbh;
	private String operId;
	private String outHospitalId;
	private String outHospitalName;
	private String fromDeptCode;
	private String fromDeptName;
	private String fromDoctorCode;
	private String fromDoctorName;
	private String changeCliniqueReason;
	private String medicalRecord;
	private String preDiagnosis;
	private int beginTime;
	private int endTime;
	private String msgType;
	private int id;
	private int reserveNo1;
	private String errMsg;
	private Date createDate;
	
	
}
