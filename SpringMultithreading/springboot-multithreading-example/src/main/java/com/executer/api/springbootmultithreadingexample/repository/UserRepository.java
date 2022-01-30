package com.executer.api.springbootmultithreadingexample.repository;

import com.executer.api.springbootmultithreadingexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
