package com.classickitchen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classickitchen.entities.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
