package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.model.Province;

public interface ProvinceDAO extends MongoRepository<Province, String> {
    // Custom query to find a province by name
    Province findByName(String name);
}
// @PostConstruct