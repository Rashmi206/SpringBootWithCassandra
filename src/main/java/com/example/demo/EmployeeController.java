package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import java.util.List;
import java.util.Random;

@RestController
public class EmployeeController {
	@Autowired
    EmployeeService employeeService;
	 @GetMapping(value="/employees")
	 public List<Employee> getAllEmployees(){
	        return employeeService.getAllEmployees();
	    }
	 @PostMapping("/employee")
	 public Employee addEmployee(@RequestBody Employee newEmployee)
	 {
	  Employee emp = new Employee(newEmployee.getEmpid(), newEmployee.getEmpcity(), newEmployee.getEmpname(), newEmployee.getEmpsal());
	  return employeeService.saveEmployee(emp);
	 }
	 
}
