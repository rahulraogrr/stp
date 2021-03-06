package com.example.user.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.entities.User;
import com.example.user.repositories.UserRepository;
import com.example.user.services.UserService;
import com.example.user.vo.Department;
import com.example.user.vo.UserVO;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public UserVO getUserById(Long id) {

		UserVO userVO = new UserVO();
		User user = userRepository.findById(id).get(); 

		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDeptId(),
				Department.class);

		userVO.setUser(user);
		userVO.setDepartment(department);

		return userVO;
	}

	@Override
	public User updateUser(Long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

}
