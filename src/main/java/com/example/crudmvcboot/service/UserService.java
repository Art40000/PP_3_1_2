package com.example.crudmvcboot.service;

import com.example.crudmvcboot.model.User;
import java.util.List;

public interface UserService {
    public void saveUser(User user) ;
    public void remove(Long id) ;
    public User getUserById(Long id);
    public List<User> getAllUsers();
}
