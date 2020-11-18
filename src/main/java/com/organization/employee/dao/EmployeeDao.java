package com.organization.employee.dao;

import java.util.List;

import com.organization.employee.model.Employee;

public interface EmployeeDao {
	 public boolean saveEmployee(Employee employee);  
	    public List<Employee> getStudents();  
}
