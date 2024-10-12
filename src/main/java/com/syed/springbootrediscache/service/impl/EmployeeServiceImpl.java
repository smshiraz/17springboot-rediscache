package com.syed.springbootrediscache.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.syed.springbootrediscache.model.Employee;
import com.syed.springbootrediscache.repo.EmployeeRepository;
import com.syed.springbootrediscache.service.IEmployeeService;
import com.syed.springbootrediscache.exception.*;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee saveEmployee(Employee e) {
		return repo.save(e);
	}

	@Override
	@CachePut(value="employees", key="#id")
	public Employee updateEmployee(Integer id, Employee e) {
		Employee emp=repo.findById(id).
				orElseThrow(()->new ResourceNotFound("Employee Not Found"));
		emp.setEmpName(e.getEmpName());
		emp.setEmpSal(e.getEmpSal());
		return repo.save(emp);
	}

	@Override
	@CacheEvict(value="employees", key="#id")
	public void deleteEmployee(Integer id) {
		Employee emp=repo.findById(id).
				orElseThrow(()->new ResourceNotFound("Employee Not Found"));
		
		repo.delete(emp);
		
	}

	@Override
	@Cacheable(value="employees", key="#id")
	public Employee getOneEmployee(Integer id) {
		Employee emp=repo.findById(id).
				orElseThrow(()->new ResourceNotFound("Employee Not Found"));
		return emp;
	}

	@Override
	public List<Employee> getAllEmployee() {
				return repo.findAll();
	}

}
