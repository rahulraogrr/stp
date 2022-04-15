package com.example.department.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.department.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
}
