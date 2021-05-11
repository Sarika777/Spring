package com.user.registration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.registration.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
