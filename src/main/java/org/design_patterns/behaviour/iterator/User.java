package org.design_patterns.behaviour.iterator;

public class User {

    private int userID;
    private String username;
    private String email;

    public User(int userID, String username, String email) {
        this.userID = userID;
        this.username = username;
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
