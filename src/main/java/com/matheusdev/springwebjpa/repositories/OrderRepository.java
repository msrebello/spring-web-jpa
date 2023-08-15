package com.matheusdev.springwebjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.springwebjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

