package com.scaler.designpatterns.myfactory.factory;

public class UserFactory {
    public User createUser(String type) {
        if (type.equals("Student")) {
            return new Student();
        } else if (type.equals("Mentor")) {
            return new Mentor();
        } else if (type.equals("Instructor")) {
            return new Instructor();
        } else if (type.equals("TeachingAssistant")) {
            return new TeachingAssisstant();
        } else {
            return null;

        }
    }
}
