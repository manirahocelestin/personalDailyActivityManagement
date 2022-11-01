package com.nkunda.personaldailyactivitymanagement.repository;

import com.nkunda.personaldailyactivitymanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
