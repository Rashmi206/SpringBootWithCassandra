package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;

	@Override 
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	@Override
	public Employee saveEmployee(Employee emp) {
		employeeRepository.save(emp);
		return emp;
	}
}
