package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.model.Employee;

@Service
public interface EmployeeService {
	List<Employee> getAllEmployees();
	Employee saveEmployee(Employee emp);
}
