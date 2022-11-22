package com.example.crudmvcboot.service;

import com.example.crudmvcboot.model.User;
import com.example.crudmvcboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }
    @Override
    @Transactional
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    @Transactional
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }
    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
