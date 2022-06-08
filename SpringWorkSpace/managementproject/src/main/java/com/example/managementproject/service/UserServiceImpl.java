package com.example.managementproject.service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.example.managementproject.entity.UserInfo;

public interface UserServiceImpl {
//	List<UserEntity> getAllUsers();
//	List<UserEntity> getUserByUsername(String username);
//	Optional<UserEntity> getUsernameById(long id);
//	
//	void updateUser(Integer id, UserEntity user);
//	void addUser(UserEntity user);
//	void deleteUser(long id);
//	void saveUser(UserEntity user);
	
	public UserInfo getUser(Integer id) throws NotFoundException;

    public UserInfo createUser(UserInfo userInfo);

    public List<UserInfo> getUsers();

    public UserInfo updateUser(Integer id, UserInfo request) throws NotFoundException;
}
