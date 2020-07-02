package com.szeye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.szeye.entity.DoctorCalendar;

@Repository
public interface DoctorCalendarRepository extends BaseRepository<DoctorCalendar> {
	
	@Query(value="from DoctorCalendar")
	public List<DoctorCalendar> findAll();
	
	
	
}
