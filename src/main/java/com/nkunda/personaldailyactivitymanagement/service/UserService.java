package com.nkunda.personaldailyactivitymanagement.service;

import com.nkunda.personaldailyactivitymanagement.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> findAll();
    User findById(Long id);
    User findByName(String name);
    User updateByUser(User user);
    User findUserByEmail(String email);
    List<User> findUserByRole(String roleName);
    void deleteById(Long id);
}
