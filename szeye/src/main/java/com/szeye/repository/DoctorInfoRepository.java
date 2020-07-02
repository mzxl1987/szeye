package com.szeye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.szeye.entity.DoctorInfo;

@Repository
public interface DoctorInfoRepository extends BaseRepository<DoctorInfo> {
	
	@Query(value="from DoctorInfo")
	public List<DoctorInfo> findAll();
	
	
	
}
