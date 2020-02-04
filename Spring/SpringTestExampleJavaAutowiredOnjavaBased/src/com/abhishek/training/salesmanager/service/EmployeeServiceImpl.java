package com.abhishek.training.salesmanager.service;

import java.io.ObjectInputStream.GetField;
import java.util.List;

import com.abhishek.training.salesmanager.model.Employee;
import com.abhishek.training.salesmanager.repository.EmployeeRepository;
import com.abhishek.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	//EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	EmployeeRepository employeeRepository;
	
	
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) { //changes to ex1
		System.out.println("overload constructor executed");
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeServiceImpl() {
	System.out.println("default constructor executed");
	
	}
	
	public EmployeeRepository getEmployeeRepository() { 				//changes to ex1
		return employeeRepository;
	}
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmployees(){
	
		return employeeRepository.getAllEmployees();
	}

}
