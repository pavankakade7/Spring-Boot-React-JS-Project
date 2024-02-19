package com.ems.backend.Service;

import org.springframework.stereotype.Service;

import com.ems.backend.Dto.EmployeeDto;
import com.ems.backend.Entity.Employee;
import com.ems.backend.Mapper.EmployeeMapper;
import com.ems.backend.Repository.EmployeeRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
	
		Employee savedEmployee	= employeeRepository.save(employee);
		
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
		
		
	}

}
