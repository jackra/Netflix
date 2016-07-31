package com.egen.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egen.api.entity.User;
import com.egen.api.repository.UserRepository;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User findOne(String id) {
		User existing = repository.findOne(id);
		return existing;
	}

	@Override
	public User create(User user) {
		User existing = repository.findByEmail(user.getEmail());
		return repository.create(user);
	}

	@Override
	public User update(String id, User user) {
		User existing = repository.findOne(id);
		return repository.update(user);
	}

	@Override
	public void delete(String id) {
		User existing = repository.findOne(id);
		repository.delete(existing);
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return repository.findByEmail(email);
	}
}
