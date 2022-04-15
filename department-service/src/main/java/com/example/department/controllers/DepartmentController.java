package com.example.department.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.department.entities.Department;
import com.example.department.services.DepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping
	public ResponseEntity<?> saveDepartment(@RequestBody Department department){
		
		return ResponseEntity.created(
				ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(
						departmentService.saveDeptartment(department).getId()
						).toUri()
				).build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteDepartment(@PathVariable Long id){
		departmentService.deleteDepartment(id);
		return ResponseEntity.ok("Resource Deleted Successfully");
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable Long id){
		return ResponseEntity.ok(departmentService.getDepartmentById(id)); 
	}
	
	@GetMapping
	public ResponseEntity<List<Department>> getDepartment(){
		return ResponseEntity.ok(departmentService.getDepartment()); 
	}
}