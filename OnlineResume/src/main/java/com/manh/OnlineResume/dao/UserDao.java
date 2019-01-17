package com.manh.OnlineResume.dao;

import com.manh.OnlineResume.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends MongoRepository<User, String> {
    User findUserByUserName(String userId);
}