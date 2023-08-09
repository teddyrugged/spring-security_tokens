package com.example.userservice.repository;

import com.example.userservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepo extends JpaRepository<Role,Long> {

//    trying to use full name in place of name for name as i dt want to use different name.
//    Role findByNameEqualsIgnoreCase(String fullName);
    Role findByName(String name);
}
