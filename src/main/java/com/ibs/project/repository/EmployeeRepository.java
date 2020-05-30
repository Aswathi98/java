package com.ibs.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.project.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String>{

}

