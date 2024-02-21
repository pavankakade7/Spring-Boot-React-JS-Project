package com.ems.backend.Service;

import java.util.List;
import java.util.Optional;


import com.ems.backend.Entity.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee employee);
	Optional<Employee> getEmployeeById(Long id);
	List<Employee> findAllEmployees(Employee employee);

}
