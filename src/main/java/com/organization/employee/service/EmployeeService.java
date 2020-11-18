package com.organization.employee.service;

import java.util.List;

import com.organization.employee.model.Employee;

public interface EmployeeService {
    public boolean saveEmployee(Employee employee);  
    public List<Employee> getEmployees();  

}
