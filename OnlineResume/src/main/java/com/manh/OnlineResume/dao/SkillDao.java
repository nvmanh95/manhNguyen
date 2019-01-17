package com.manh.OnlineResume.dao;

import com.manh.OnlineResume.model.Skill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillDao extends MongoRepository<Skill, String> {
    List<Skill> getAllSkills();
}