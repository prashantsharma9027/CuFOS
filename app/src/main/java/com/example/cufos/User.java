package com.example.cufos;


public class User {
    String  userNameET, emailET, phoneET, passwordET;

    public User(String userNameET, String emailET, String phoneET, String passwordET) {
        this.userNameET = userNameET;
        this.emailET = emailET;
        this.phoneET = phoneET;
        this.passwordET = passwordET;
    }

    public String getUserNameET() {
        return userNameET;
    }

    public void setUserNameET(String userNameET) {
        this.userNameET = userNameET;
    }

    public String getEmailET() {
        return emailET;
    }

    public void setEmailET(String emailET) {
        this.emailET = emailET;
    }

    public String getPhoneET() {
        return phoneET;
    }

    public void setPhoneET(String phoneET) {
        this.phoneET = phoneET;
    }

    public String getPasswordET() {
        return passwordET;
    }

    public void setPasswordET(String passwordET) {
        this.passwordET = passwordET;
    }
}