package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.model.Recommendation;
import java.util.List;

public interface RecommendationDAO extends MongoRepository<Recommendation, String> {
    // Custom query to find recommendations by provinceId
    List<Recommendation> findByProvinceId(String provinceId);
}
