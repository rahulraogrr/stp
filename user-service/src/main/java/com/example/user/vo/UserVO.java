package com.example.user.vo;

import com.example.user.entities.User;

public class UserVO {
	
	private User user;
	private Department department;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public UserVO(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}

	public UserVO() {
		
	}
	
}
