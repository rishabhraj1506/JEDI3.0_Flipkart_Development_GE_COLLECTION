package com.flipkart.bean;

public abstract class User {
    // Attributes
    private String ID;
    private String name;
    private String role;
    private String contact;
    private String email;

    // Constructor
    public User(String ID, String name, String role, String contact, String email) {
        this.ID = ID;
        this.name = name;
        this.role = role;
        this.contact = contact;
        this.email = email;
    }

    // Getter and Setter methods
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Abstract methods
    public abstract void update();
    public abstract void changePassword();
    public abstract void login();
}