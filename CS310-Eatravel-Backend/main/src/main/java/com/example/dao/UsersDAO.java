package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.model.Users;

public interface UsersDAO extends MongoRepository<Users, String> {
    boolean existsByUsername(String username);

    Users findByUsername(String username);

    // Custom query to find a user by email
    Users findByEmail(String email);
}
