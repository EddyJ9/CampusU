package com.campus.u.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by EddyJ on 12/7/16.
 */
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    @JsonIgnore
    private String name;

    @Column
    @JsonIgnore
    private String email;

    @Column
    @JsonIgnore
    private String phone;

    @Column (nullable = false, unique = true)
    private String username;

    @Column (nullable = false)
    @JsonIgnore
    private String password;

    public User(){

    }

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
