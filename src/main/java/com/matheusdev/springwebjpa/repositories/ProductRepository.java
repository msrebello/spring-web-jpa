package com.matheusdev.springwebjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.springwebjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

