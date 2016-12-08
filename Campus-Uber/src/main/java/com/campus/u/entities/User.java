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

    @Column
    private String username;

    @Column
    @JsonIgnore
    private String password;



}
