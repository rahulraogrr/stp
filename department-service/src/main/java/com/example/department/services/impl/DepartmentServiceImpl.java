package com.example.department.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.entities.Department;
import com.example.department.repositories.DepartmentRepository;
import com.example.department.services.DepartmentService;

@Service("DepartmentServiceImpl") 
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDeptartment(Department department) {
		return departmentRepository.save(department); 
	}

	@Override
	public Department updateDepartment(Long id, Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getDepartment() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Long id) {
		return departmentRepository.findById(id).get(); 
	}

	@Override
	public void deleteDepartment(Long id) {
		departmentRepository.deleteById(id); 
	}
	
}