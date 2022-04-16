package com.example.user.controllers;

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

import com.example.user.entities.User;
import com.example.user.services.UserService;
import com.example.user.vo.UserVO;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/users")
public class UserController {

	private static final String DEPT_SERVICE = "deptService"; 
	
	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(userService.saveUser(user).getId()).toUri()).build();
	}
	
	@GetMapping("/{id}")
	@CircuitBreaker(name = DEPT_SERVICE, fallbackMethod = "deptServiceFallback")
	public ResponseEntity<UserVO> getUserById(@PathVariable Long id){
		return ResponseEntity.ok(userService.getUserById(id)); 
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable Long id){
		userService.deleteUserById(id);
		return ResponseEntity.ok("Resource Deleted Successfully"); 
	}
	
	public ResponseEntity<UserVO> deptServiceFallback(Exception e) {
		return ResponseEntity.ok(new UserVO());
	}
}
