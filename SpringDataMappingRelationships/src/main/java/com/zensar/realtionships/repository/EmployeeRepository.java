package com.zensar.realtionships.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.realtionships.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
