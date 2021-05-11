package com.user.registration.service;

import com.user.registration.model.User;

public interface UserService {

	void save(User user);

    User findByUsername(String username);
}
