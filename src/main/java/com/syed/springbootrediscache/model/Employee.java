package com.syed.springbootrediscache.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable{
	
	
	@Id
	@GeneratedValue
	private Integer id;
	private String  empName;
	private Double empSal;
	
	public Employee() {

	}
		
	public Employee(Integer empId, String empName, Double empSal) {
		super();
		this.id = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public Integer getEmpId() {
		return id;
	}

	public void setEmpId(Integer empId) {
		this.id = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	
	
	

}
