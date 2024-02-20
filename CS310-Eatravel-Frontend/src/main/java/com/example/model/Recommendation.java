package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import com.example.model.Feedback;

@Document(collection = "recommendations")
public class Recommendation {
    @Id
    private String id;
    private String provinceId;
    private List<Feedback> feedbacks = new ArrayList<>();

    // Constructors, getters, and setters

    public Recommendation() {
        // Default constructor
    }

    public Recommendation(String provinceId) {
        this.provinceId = provinceId;
     
    }

    // Getters and setters for all fields

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    
    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    // Add other getter and setter methods for additional fields

    // Method to add feedback
    public void addFeedback(Feedback feedback) {
        this.feedbacks.add(feedback);
    }
}
