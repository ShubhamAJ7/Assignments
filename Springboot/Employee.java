package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empspring")
public class Employee {
	@Id
	@GeneratedValue
	@Column(length=12)
	private int empId; 
	@Column(length=12)
	private String ename;
	@Column(length=12)
	private int esal;
	@Column(length=12)
	private String city;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEid(int eid) {
		this.empId = eid;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String ename, int esal, String city) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.esal = esal;
		this.city = city;
	}
	
}
