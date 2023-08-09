package com.example.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity @Data @NoArgsConstructor @AllArgsConstructor

public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    private String firstname;
//    private String middle_name;
//    private String lastname;
    private String name;
    private String username;
    private String email;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)

    private Collection<Role> roles = new ArrayList<>();


}
