package com.syed.springbootrediscache.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.syed.springbootrediscache.model.Employee;
@Service
public interface IEmployeeService {

	public Employee saveEmployee(Employee e);
	public Employee updateEmployee(Integer id,Employee e);
	public void deleteEmployee(Integer id);
	
	public Employee getOneEmployee(Integer id);
	
	public List<Employee> getAllEmployee();
	
	
	
}
