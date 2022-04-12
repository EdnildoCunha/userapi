package com.java.userapi.userapi.repositories;

import com.java.userapi.userapi.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
