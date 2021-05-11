package com.user.registration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.registration.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
