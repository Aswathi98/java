package com.ibs.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorisation")
public class LoginEntity {

	
	@Id
	@Column(name = "emp_id")
	private String employeeId;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "emp_name")
	private String employeeName;

	
  public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

@Override
  public String toString() {
    return "Employee [ employeeId=" +  employeeId + ", password=" + password 
        + ", employeeName=" + employeeName + "]";
  }

}