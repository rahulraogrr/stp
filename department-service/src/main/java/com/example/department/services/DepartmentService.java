package com.example.department.services;

import java.util.List;
import com.example.department.entities.Department;

public interface DepartmentService {
   	Department saveDeptartment(Department department);
    Department updateDepartment(Long id, Department department);
	List<Department> getDepartment();
    Department getDepartmentById(Long id);
	void deleteDepartment(Long id);
}