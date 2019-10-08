package com.codingmonk.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingmonk.dto.UserDTO;
import com.codingmonk.pojo.User;

@Service
public class UserServices {
	
	@Autowired
	UserDTO userDTO;
	public void save(User user) {
		userDTO.save(user);
	}
	
	public Optional<User> getUser(Integer id) {
		return userDTO.findById(id);
	}

}
