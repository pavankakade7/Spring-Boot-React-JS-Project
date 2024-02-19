package com.ems.backend.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.backend.Dto.EmployeeDto;
import com.ems.backend.Service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	
	// Build add Employee REST API
	
	@PostMapping(name = "/created")
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto  employeedto){
	EmployeeDto savedEmployeeDto =	employeeService.createEmployee(employeedto);
	return new ResponseEntity<>(savedEmployeeDto, HttpStatus.CREATED);
	}
}
