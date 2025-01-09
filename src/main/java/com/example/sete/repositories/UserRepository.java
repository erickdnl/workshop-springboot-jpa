package com.example.sete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sete.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
