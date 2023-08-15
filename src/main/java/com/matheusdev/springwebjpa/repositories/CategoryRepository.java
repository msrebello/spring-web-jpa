package com.matheusdev.springwebjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.springwebjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}

