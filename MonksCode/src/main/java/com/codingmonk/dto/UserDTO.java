package com.codingmonk.dto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.codingmonk.pojo.User;


public interface UserDTO extends CrudRepository<User, Integer>  {

}
