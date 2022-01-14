package com.oneToMany;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@Column(name="employee_id")
	private int employeeid;
	private String employeename;
	
	@OneToMany(mappedBy="employee",fetch=FetchType.EAGER)
	private List<Department> department;
	
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	
	
	public List<Department> getDepartment() {
		return department;
	}
	public void setDepartment(List<Department> department) {
		this.department = department;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeid, String employeename, List<Department> department) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.department = department;
	}
	
	}
	
	
	
	
	
	


