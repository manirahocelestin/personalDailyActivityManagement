package com.nkunda.personaldailyactivitymanagement.serviceImplement;

import com.nkunda.personaldailyactivitymanagement.model.User;
import com.nkunda.personaldailyactivitymanagement.repository.UserRepo;
import com.nkunda.personaldailyactivitymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImplement implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User createUser(User user) {
        try {
            return userRepo.save(user);
        }catch (Exception e){
            throw new RuntimeException("please check your process");
        }
    }

    @Override
    public List<User> findAll() {
        try {
            return userRepo.findAll();
        }catch (Exception e){
            throw new RuntimeException("Please check your table might be empty");
        }

    }

    @Override
    public User findById(Long id) {
        return null;

    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public User updateByUser(User user) {
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public List<User> findUserByRole(String roleName) {
        return null;
    }

    @Override
    public void deleteById(Long id) {


    }
}
