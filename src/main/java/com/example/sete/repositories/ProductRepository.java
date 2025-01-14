package com.example.sete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sete.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
