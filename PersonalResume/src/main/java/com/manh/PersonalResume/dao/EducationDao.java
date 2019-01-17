package com.manh.PersonalResume.dao;

import com.manh.PersonalResume.model.Education;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationDao extends MongoRepository<Education, String> {
    List<Education> getAllEducations();

    Education getEducationById(String educationId);
}
