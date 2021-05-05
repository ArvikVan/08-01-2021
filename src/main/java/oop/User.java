package com.company.oop;

public class User {
    private String userName;
    private boolean valid;

    public User(String userName, boolean valid) {
        this.userName = userName;
        this.valid = valid;
    }

    public String getUserName() {
        return userName;
    }
}
