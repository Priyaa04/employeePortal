package com.organization.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.employee.model.Employee;
import com.organization.employee.service.EmployeeService;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
    @PostMapping("save-employee")  
    public boolean saveStudent(@RequestBody Employee employee) {  
         return employeeService.saveEmployee(employee);  
          
    }  
    @GetMapping("employee-list")  
    public List<Employee> allstudents() {  
         return employeeService.getEmployees();  
          
    }  

}
