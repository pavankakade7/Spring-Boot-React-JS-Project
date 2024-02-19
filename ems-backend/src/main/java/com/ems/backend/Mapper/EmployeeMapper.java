package com.ems.backend.Mapper;	

import com.ems.backend.Dto.EmployeeDto;
import com.ems.backend.Entity.Employee;

public class EmployeeMapper {

		public static EmployeeDto mapToEmployeeDto(Employee employee) {
			
			return new EmployeeDto(
					
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getPhone()
				);
		}
		
		public static Employee mapToEmployee(EmployeeDto employeeDto) {
			
			return new Employee(
					employeeDto.getId(),
					employeeDto.getFirstName(),
					employeeDto.getLastName(),
					employeeDto.getEmail(),
					employeeDto.getPhone()
					
					
					);
					
		}
}
