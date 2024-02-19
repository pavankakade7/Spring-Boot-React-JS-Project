package com.ems.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.backend.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
