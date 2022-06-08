package com.example.managementproject.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import com.example.managementproject.entity.UserInfo;
import com.example.managementproject.repository.UserRepository;

@Service
public class UserService implements UserServiceImpl {

	private final UserRepository userInfoRepository;

	public UserService(UserRepository userInfoRepository) {
		this.userInfoRepository = userInfoRepository;
	}

	public UserInfo getUser(Integer id) throws ChangeSetPersister.NotFoundException {
		return userInfoRepository.findByIdAndActive(id, true).orElseThrow(ChangeSetPersister.NotFoundException::new);
	}

	public UserInfo createUser(UserInfo userInfo) {
		return userInfoRepository.save(userInfo);
	}

	public List<UserInfo> getUsers() {
		return userInfoRepository.findAllByActiveOrderByIdDesc(true);
	}

	public UserInfo updateUser(Integer id, UserInfo request) throws ChangeSetPersister.NotFoundException {
		UserInfo fromDb = getUser(id);
		fromDb.setFirstName(request.getFirstName());
		fromDb.setLastName(request.getLastName());
		fromDb.setActive(request.isActive());
		fromDb.setUpdatedAt(LocalDateTime.now());
		return userInfoRepository.save(fromDb);
	}

}
