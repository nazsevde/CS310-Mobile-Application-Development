package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "feedbacks")
public class Feedback {
    @Id
    private String id;
    private String userId;
    private String comment;
    private int rating;
    private String foodName;

    // Constructors, getters, and setters

    public Feedback() {
        // Default constructor
    }

    public Feedback(String userId, String comment, int rating, String foodName) {
        this.userId = userId;
        this.comment = comment;
        this.rating = rating;
        this.foodName = foodName;
    }

    // Getters and setters for all fields

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }


    

    @Override
    public String toString() {
        return "Feedback{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}

