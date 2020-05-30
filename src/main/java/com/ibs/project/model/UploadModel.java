package com.ibs.project.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UploadModel {

	private String empId;
	private String slNo;
	private String seatNo;
	private String allocatedTo;
	private String shortName;
	private String project;
	private String location;
	private String facility;
	private String floor;
	private String wing;
	private long loc_id;
	private long fac_id;
	private long floor_id;
	private long space_id;
	private long proj_id;
	private long wing_id;
	public long getLoc_id() {
		return loc_id;
	}
	public void setLoc_id(long loc_id) {
		this.loc_id = loc_id;
	}
	public long getFac_id() {
		return fac_id;
	}
	public void setFac_id(long fac_id) {
		this.fac_id = fac_id;
	}
	public long getFloor_id() {
		return floor_id;
	}
	public void setFloor_id(long floor_id) {
		this.floor_id = floor_id;
	}
	public long getSpace_id() {
		return space_id;
	}
	public void setSpace_id(long space_id) {
		this.space_id = space_id;
	}
	public long getProj_id() {
		return proj_id;
	}
	public void setProj_id(long proj_id) {
		this.proj_id = proj_id;
	}
	public long getWing_id() {
		return wing_id;
	}
	public void setWing_id(long wing_id) {
		this.wing_id = wing_id;
	}

	
	 public Date currentDate() throws ParseException{
	    	DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	    	Date dateobj = new Date();
	    	String str=df.format(dateobj);
	    	return(df.parse(str));
	    }
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getSlNo() {
		return slNo;
	}
	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getAllocatedTo() {
		return allocatedTo;
	}
	public void setAllocatedTo(String allocatedTo) {
		this.allocatedTo = allocatedTo;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFacility() {
		return facility;
	}
	public void setFacility(String facility) {
		this.facility = facility;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getWing() {
		return wing;
	}
	public void setWing(String wing) {
		this.wing = wing;
	}
	
	
}
