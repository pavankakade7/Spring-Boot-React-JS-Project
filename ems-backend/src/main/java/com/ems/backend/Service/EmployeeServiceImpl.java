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

	
	

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
	
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee updatEmployee(Long id, Employee employee) {
		// TODO Auto-generated method stub
		Employee employee2 = employeeRepository.findById(id).get();
		employee2.setFirstName(employee.getFirstName());
		employee2.setLastName(employee.getLastName());
		employee2.setEmail(employee.getEmail());
		employee2.setPhone(employee.getPhone());
		
		employeeRepository.save(employee2);
		return employee2;
	}

}
