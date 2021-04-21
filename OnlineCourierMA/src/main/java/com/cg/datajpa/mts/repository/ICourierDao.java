package com.cg.mts.repository;

import java.time.LocalDate;
import java.util.List;

import com.cg.mts.entities.Courier;

public interface ICourierDao {

	public void addCourierInfo(Courier courier);
	public Courier getCourierInfo(int courierid);
	public void removeCourierInfo(int courierid);
	public void updateCourierInfoSetInitiated(Courier status);
	public void updateCourierInfoSetIntransit(Courier status);
	public void updateCourierInfoSetDelivered(Courier status);
	public void updateCourierInfoSetRejected(Courier status);
	public List<Courier> getAllDeliveredCouriers();
	public List<Courier> getAllDeliveredCouriersByDate(LocalDate date);
	
	
}
