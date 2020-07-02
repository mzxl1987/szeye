package com.szeye.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.szeye.dto.DepartCalendarDto;
import com.szeye.dto.DepartInfoDto;
import com.szeye.dto.DoctorCalendarDto;
import com.szeye.dto.DoctorInfoDto;
import com.szeye.dto.RequestInfoDto;
import com.szeye.dto.Result;
import com.szeye.dto.WorkInfoDto;
import com.szeye.dto.YyInfoDto;
import com.szeye.entity.DepartInfo;
import com.szeye.entity.DoctorInfo;
import com.szeye.entity.YyInfo;
import com.szeye.service.ApiService;
import com.szeye.util.NativeQuerys;

@Service
@Transactional(rollbackOn=Exception.class)
public class ApiServiceImpl implements ApiService{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	NativeQuerys nativeQuerys;
	
	@Override
	public Object getHostInfo(HttpServletRequest request,HttpServletResponse response) {
		
		List data = null;
		//TODO
		//获取医院信息
		return Result.getSuccessResult(data);
	}
	
	/**
	 * 医院科室信息
	 */
	@Override
	public Object getDeptInfo(HttpServletRequest request,HttpServletResponse response) {
		//获取医院科室信息
		String sql_query = "select "
				+ "ksdm ,"
				+ "ksmc as departName,"
				+ "'' as DepartIntro,"
				+ "ghlb,"
				+ "ghf as Registryfee,"
				+ "zlf as Chinicfee,"
				+ "mzks,"
				+ "case ksxb when 1 then 1 when 2 then 2 else 0 end as Departsex,"
				+ "CASE WHEN ekbz = '1' THEN 1  WHEN etby = '1' THEN 2 ELSE 0 end as Babyflag," 
				+ "CASE WHEN ekbz = '1' THEN 14  WHEN etby = '1' THEN 15 end as BabyAge,"
				+ "kswz" 
				+ " from Ms_ghks " 
				+ " where ghlb in ('1','2','3','4')";
		
		return nativeQuerys.queryAll(sql_query, DepartInfoDto.class, null);
	}
	
	/**
	 * 获取医生信息
	 */
	@Override
	public Object getDocInfo(HttpServletRequest request,HttpServletResponse response) {
		//获取医院医生信息
		
		String sql_query = "select "
				+ " ygdm as DoctorId ,"
				+ " ksdm as DepartId,"
				+ " ygxm as DoctorName,"
				+ " ygxb as DoctorSex,"
				+ "'' as DoctorRank,"
				+ " case YGZW when 1 then '院长' when 2 then '书记' when 3 then '科主任'when 4 then '住院医生'"
				+ " when 5 then '实习医生'when 6 then '普通职工'when 7 then '主治医师' "
				+ " when 8 then '副主任医师'when 9 then '主任医师' "
				+ " when 10 then '副主任护师' when 11 then '主任护师' end as DoctorRank,"
				+ " ysjj as DoctorInro,"
				+ " '' as DoctorIntor,"
				+ " zjpb as IsExpert,"
				+ " '' as AVeworktime,"
				+ " YGZW "
				+ " from gy_ygdm "
				+ " where "
				+ " kcfq='Y' "
				+ " and zjpb = '1' "
				+ " and ygdm not in ('0000') "
				+ " and ygxb is not null";
		
		return nativeQuerys.queryAll(sql_query, DoctorInfoDto.class, null);
	}
	
	/**
	 * 获取医生排班
	 */
	@Override
	public Object getDocWorksInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		//获取医院医生排班信息
		String sql_query = "select a.tgbz as WorkStatus,"
//				+ "b.ksmc,"
				+ "a.ysdm as DoctorId,"
				+ "a.ksdm as DepartId,"
				+ "a.gzrq as WorkDate,"
				+ "a.zblb as WorkType," 
				+ "a.sjxh as BeginNo,"
				+ "a.sjxhjg as SpaceNo,"
				+ "a.sjxe as Limited,"
				+ "b.ghf as Registryfee," 
				+ "b.zlf as Chinicfee,"
				+ "c.zjfy as Expertsfee "
//				+ "c.ygxm as ygxm,"
//				+ "c.ysjj as remark" 
				+ " from ms_yspb a,ms_ghks b,gy_ygdm c" 
				+ " where 1=1 and a.ksdm=b.ksdm and a.ysdm=c.ygdm and a.gzrq >= :startTime and a.gzrq < :endTime ;";
		
		Map<String,Object> params = new HashMap<>();
		params.put("startTime", obj.getBeginTime());
		params.put("endTime", obj.getEndTime());
		
		return nativeQuerys.queryAll(sql_query, DoctorCalendarDto.class, params);
	}
	
	/**
	 * 科室排班信息
	 */
	@Override
	public Object getDeptWorksInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		//获取医院科室排班信息
		String sql_query = "select "
				+ " a.tgbz as WorkStatus,"
				+ "a.ghks as DepartId,"
				+ "a.ghrq as WorkDate,"
				+ "a.zblb as WorkType,"
				+ "'' as BeginNo,"
				+ "'' as SpaceNo,"
				+ "'' as Limited, "
				+ "b.ghf as Registryfee,"
				+ "b.zlf as Chinicfee "
//				+ "b.ksmc as ksmc,"
//				+ "b.zzkspb as zzkspb,"
//				+ "b.dwkfbz"
				+ " from ms_kspb a ,ms_ghks b " 
				+ " where 1=1 "
				+ " and a.ghks=b.ksdm  "
				+ " and a.ghrq = :ghrq" 
				+ " and (b.dwkfbz ='0' or b.dwkfbz is null)" 
				+ " and b.zjmz ='0'" 
				+ " order by b.ksmc;";
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("ghrq",obj.getWorkDate());
		
		return nativeQuerys.queryAll(sql_query, DepartCalendarDto.class, params);
	}
	
	/**
	 * 号源信息
	 */
	@Override
	public Object getDtNoInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		//获取号源信息
		
		String sql_query = "select "
				+ "a.ysdm as DoctorId,"
				+ "a.ksdm as DepartId,"
				+ "a.ghrq as WorkDate,"
				+ "a.zblb as WorkType,"
				+ "a.kssj as StartTime,  "
				+ "a.zzsj as EndTime,"
				+ "a.kyzs as TotalNum,"
				+ "(a.kyzs - isnull(b.yyzs,0)) as LeftNum, "
				+ "isnull(b.yyzs,0) as CheckNum "
				+ " from (select ksdm,ysdm,zblb,ghrq,kssj,zzsj,kssj+'-'+zzsj as qhsd,count(*) as kyzs "
				+ "       from ms_yyhy "
				+ "       where 1=1 "
				+ "             and ysdm='1120' "
				+ "             and ghrq='3' "
				+ "             and zblb ='1'"
				+ "       group by ksdm,ysdm,zblb,ghrq,kssj,zzsj) a "
				+ " left join (select ksdm,ysdm,zblb,qhsd,count(*) as yyzs "
				+ "            from ms_yygh "
				+ "            where ghbz <> 4 "
				+ "                  and ysdm='1120'  "
				+ "                  and yyrq='2020-06-09' "
				+ "                  and zblb ='1'  "
				+ "            group by ksdm,ysdm,zblb,qhsd )b on a.qhsd=b.qhsd  "
				+ " order by a.ksdm,a.ysdm,a.ghrq,a.zblb,a.kssj";
		
		Map<String,Object> params = new HashMap<>();
		
		return nativeQuerys.queryAll(sql_query, WorkInfoDto.class, params);
	}
	
	@Override
	public Object getYyNo(YyInfo obj,HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//预约挂号
		return Result.getSuccessResult(data);
	}
	
	@Override
	public Object getGhInfo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//查询挂号信息
		return Result.getSuccessResult(data);
	}
	
	@Override
	public Object backNo(RequestInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//退号
		return Result.success(data);
	}
	
	@Override
	public Object updateOrderInfo(YyInfoDto obj,HttpServletRequest request,HttpServletResponse response) {
		List data = null;
		//TODO
		//退号
		return Result.success(data);
	}
	
		
}
