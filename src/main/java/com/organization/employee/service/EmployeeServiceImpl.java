package com.organization.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.organization.employee.dao.EmployeeDao;
import com.organization.employee.model.Employee;

@Service  
@Transactional 
public class EmployeeServiceImpl implements EmployeeService{
	 @Autowired  
	    private EmployeeDao employeedao;  
	      
	    @Override  
	    public boolean saveEmployee(Employee employee) {  
	        return employeedao.saveEmployee(employee);  
	    }  
	  
	    @Override  
	    public List<Employee> getEmployees() {  
	        return employeedao.getStudents();  
	    }  

}
