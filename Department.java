package com.oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	@Id
	@Column(name="department_id")
	private int departmentid;
	private String departmentname;
	
	@ManyToOne
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int departmentid, String departmentname,Employee employee) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.employee=employee;
	}
	
	
	
	

}
