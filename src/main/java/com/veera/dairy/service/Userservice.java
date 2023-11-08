package com.veera.dairy.service;

import java.util.List;

import com.veera.dairy.Entities.User;

public interface Userservice {
	public User saveuser(User user);
	public User updateuser(User user);
	public void  deleteuser(User user);
	public User findById(int id);
	public List<User> findAll();
	public User findByUsername(String username);
	
}
