package com.manh.OnlineResume.service;

import com.manh.OnlineResume.model.User;

public interface UserService {
    User findUserByUserName(String userName);
}
