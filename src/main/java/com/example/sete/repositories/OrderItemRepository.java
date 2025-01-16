package com.example.sete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sete.entities.OrderItem;
import com.example.sete.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
