package com.btkakademi.login.service;

import com.btkakademi.login.dto.entity.UserInfo;

public interface UserService {

    int addUser(UserInfo name);

    boolean existsById(int id);

}
