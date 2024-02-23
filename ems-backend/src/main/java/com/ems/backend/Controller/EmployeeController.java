package com.ems.backend.Controller;

import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ems.backend.Entity.Employee;
import com.ems.backend.Service.EmployeeService;

import lombok.AllArgsConstructor;

@CrossOrigin("*")
// @AllArgsConstructor
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	// Build add Employee REST API

	
	@PostMapping
	public Employee createEmployee( @ RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById( @PathVariable("id") Long id) {
		return employeeService.getEmployeeById(id);
	}
	
//	@GetMapping("/employees")
	@GetMapping
	public List<Employee> findAllEmployees( Employee employee){
		return employeeService.findAllEmployees(employee);
	}
	
	@PutMapping("/update-employee/{id}")
	public Employee updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {

		return employeeService.updatEmployee( id,employee);
	}
	
//	@DeleteMapping("/{id}")
	@DeleteMapping("/delete-employee/{id}")
	public 	void deleteEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployee(id);
	}
}

