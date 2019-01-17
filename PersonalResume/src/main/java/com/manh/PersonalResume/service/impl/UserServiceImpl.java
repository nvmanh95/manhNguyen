package com.manh.PersonalResume.service.impl;

import com.manh.PersonalResume.dao.UserDao;
import com.manh.PersonalResume.model.User;
import com.manh.PersonalResume.service.UserService;
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