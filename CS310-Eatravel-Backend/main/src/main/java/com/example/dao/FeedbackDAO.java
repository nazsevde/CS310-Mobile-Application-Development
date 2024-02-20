package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.model.Feedback;
import java.util.List;

public interface FeedbackDAO extends MongoRepository<Feedback, String> {
    // Custom query to find feedbacks by userId
    List<Feedback> findByUserId(String userId);
}
