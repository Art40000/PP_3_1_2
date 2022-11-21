package com.example.crudmvcboot.service;

import com.example.crudmvcboot.model.User;
import com.example.crudmvcboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }
    @Transactional
    public void remove(Long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }
    @Transactional
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
