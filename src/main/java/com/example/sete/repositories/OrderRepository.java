package com.example.sete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sete.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
