package com.abhishek.training.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abhishek.training.salesmanager.repository.*;
import com.abhishek.training.salesmanager.service.*;


@Configuration
public class ApplicationConfiguration {
	
	@Bean(name = "employeeService")
	public EmployeeService getEmployeeService() {
		EmployeeServiceImpl employeeService =  new EmployeeServiceImpl(getEmployeeRepository());
		//employeeService.setEmployeeRepository(getEmployeeRepository());
		
		return employeeService;
		
	}
	
	@Bean(name = "employeeRepository")
	public EmployeeRepository getEmployeeRepository() {
		return new HibernateEmployeeRepositoryImpl();
	}

}
