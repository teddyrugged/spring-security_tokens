package com.example.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class  Role {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String firstname;
        private String middle_name;
        private String lastname;
//        private String username;

    }

