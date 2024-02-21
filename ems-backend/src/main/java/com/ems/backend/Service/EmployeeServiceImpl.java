package com.ems.backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.backend.Dto.EmployeeDto;
import com.ems.backend.Entity.Employee;
import com.ems.backend.Mapper.EmployeeMapper;
import com.ems.backend.Repository.EmployeeRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private  EmployeeRepository employeeRepository;
	



	@Override
	public Optional<Employee> getEmployeeById(Long id) {
		
		return employeeRepository.findById(id);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
