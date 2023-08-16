package com.matheusdev.springwebjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.springwebjpa.entities.OrderItem;
import com.matheusdev.springwebjpa.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
