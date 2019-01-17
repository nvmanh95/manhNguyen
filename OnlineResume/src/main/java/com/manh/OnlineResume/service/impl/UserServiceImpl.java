package com.manh.OnlineResume.service.impl;

import com.manh.OnlineResume.dao.UserDao;
import com.manh.OnlineResume.model.User;
import com.manh.OnlineResume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByUserName(String userName) {
        return userDao.findUserByUserName(userName);
    }
}