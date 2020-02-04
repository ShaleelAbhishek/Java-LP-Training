package com.abhishek.training.salesmanager.repository;

import java.util.List;

import com.abhishek.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}