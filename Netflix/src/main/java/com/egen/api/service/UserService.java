package com.egen.api.service;

import java.util.List;

import com.egen.api.entity.User;


public interface UserService {

	public List<User> findAll();

	public User findOne(String id);

	public User create(User user);

	public User update(String id, User user);
	
	public User findByEmail(String email);

	public void delete(String id);
}
