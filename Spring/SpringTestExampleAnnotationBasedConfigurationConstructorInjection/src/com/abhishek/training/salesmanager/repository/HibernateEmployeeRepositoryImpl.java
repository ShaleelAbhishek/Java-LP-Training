package com.abhishek.training.salesmanager.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.abhishek.training.salesmanager.model.Employee;

@Repository("employeeRepository")

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
public List<Employee> getAllEmployees(){
		
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Abhishek");
		employee.setEmployeeLocation("Dompe");
		
		employees.add(employee);
		
		return employees;
	}

}
