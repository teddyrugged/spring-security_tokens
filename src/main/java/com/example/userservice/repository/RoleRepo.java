package com.example.userservice.repository;

import com.example.userservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepo extends JpaRepository<Role,Long> {

    Role findByUsername(String username);

}