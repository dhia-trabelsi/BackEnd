package com.pfe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfe.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Integer> {

	Optional<UserInfo> findByName(String username);
	
}
