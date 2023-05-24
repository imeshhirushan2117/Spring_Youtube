package com.example.simpleroot.repo;

import com.example.simpleroot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User , Integer> {

}
