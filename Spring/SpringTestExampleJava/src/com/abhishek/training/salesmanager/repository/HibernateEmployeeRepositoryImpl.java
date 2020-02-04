package com.abhishek.training.salesmanager.repository;


import java.util.ArrayList;
import java.util.List;
import com.abhishek.training.salesmanager.model.Employee;


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
