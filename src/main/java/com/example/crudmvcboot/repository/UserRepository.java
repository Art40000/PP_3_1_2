package com.example.crudmvcboot.repository;

import com.example.crudmvcboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);
}
