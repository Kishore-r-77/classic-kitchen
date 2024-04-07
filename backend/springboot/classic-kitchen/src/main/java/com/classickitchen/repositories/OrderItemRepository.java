package com.classickitchen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classickitchen.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
