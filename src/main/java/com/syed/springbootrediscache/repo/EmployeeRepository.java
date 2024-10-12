package com.syed.springbootrediscache.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syed.springbootrediscache.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
