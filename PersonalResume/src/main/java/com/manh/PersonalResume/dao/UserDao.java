package com.manh.PersonalResume.dao;

import com.manh.PersonalResume.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends MongoRepository<User, String> {
    User findUserByUserName(String userId);
}