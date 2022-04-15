package com.example.user.services;

import java.util.List;

import com.example.user.entities.User;
import com.example.user.vo.UserVO;

public interface UserService {

	User saveUser(User user);
	List<User> getAllUsers();
	UserVO getUserById(Long id);
	User updateUser(Long id, User user);
	void deleteUserById(Long id);
	
}
