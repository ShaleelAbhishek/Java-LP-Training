package com.abhishek.training.salesmanager.service;

import java.io.ObjectInputStream.GetField;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.training.salesmanager.model.Employee;
import com.abhishek.training.salesmanager.repository.EmployeeRepository;
import com.abhishek.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")

public class EmployeeServiceImpl implements EmployeeService {
	
	//EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	//private EmployeeRepository employeeRepository;
	
	
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
		
	}
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) { //changes to ex1
		System.out.println("Constructor injection fired");
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() { 				//changes to ex1
		return employeeRepository;
	}
	
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		//System.out.println("setter injection fired");
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmployees(){
	
		return employeeRepository.getAllEmployees();
	}

}
