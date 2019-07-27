package com.sha.serverproductmanagement.repository;

import com.sha.serverproductmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JPA handles basic CRUD (Create, Read, Update, and Delete) operations
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
