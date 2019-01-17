package com.manh.PersonalResume.service;

import com.manh.PersonalResume.model.User;

public interface UserService {
    User findUserByUserName(String userName);
}
