package com.springdemo.springbootdemo.repository;

import com.springdemo.springbootdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}