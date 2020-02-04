
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.training.salesmanager.config.ApplicationConfiguration;
import com.abhishek.training.salesmanager.model.*;
import com.abhishek.training.salesmanager.service.*;

public class Application {
	public static void main(String[] args) {
		
//EmployeeService employeeService = new EmployeeServiceImpl();
		
ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		
		EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class);
		
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		for(Employee employee:employees) {
			
			System.out.println(employee.getEmployeeNmae()+ " at " + employee.getEmployeeLocation());
		}
		
		
	}

}
