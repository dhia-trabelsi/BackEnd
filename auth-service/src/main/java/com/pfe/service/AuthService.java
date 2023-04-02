package com.pfe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.pfe.entity.UserInfo;
import com.pfe.repository.UserRepository;

@Service
public class AuthService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public String addUser(UserInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "user added to system";
    }
	
}
