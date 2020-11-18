package com.organization.employee.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.organization.employee.model.Employee;

@Repository  
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired  
    private SessionFactory sessionFactory; 
	  @Override  
	    public boolean saveEmployee(Employee employee) {  
	        boolean status=false;  
	        try {  
	            sessionFactory.getCurrentSession().save(employee);  
	            status=true;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return status;  
	    } 
	   @Override  
	    public List<Employee> getStudents() {  
	        Session currentSession = sessionFactory.getCurrentSession();  
	        Query<Employee> query=currentSession.createQuery("from Employee", Employee.class);  
	        List<Employee> list=query.getResultList();  
	        return list;  
	    }
}
