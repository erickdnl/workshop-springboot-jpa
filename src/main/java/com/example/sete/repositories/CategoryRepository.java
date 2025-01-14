package com.example.sete.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sete.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
