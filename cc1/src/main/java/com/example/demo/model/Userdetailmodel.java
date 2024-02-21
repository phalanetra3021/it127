package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Userdetailmodel {
    private String firstName;
    private String lastName;
    @Id
    private String mailId;
    private String userPassword;
    public Userdetailmodel(String firstName, String lastName, String mailId, String userPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailId = mailId;
        this.userPassword = userPassword;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMailId() {
        return mailId;
    }
    public void setMailId(String mailId) {
        this.mailId = mailId;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public Userdetailmodel() {
    }
}
