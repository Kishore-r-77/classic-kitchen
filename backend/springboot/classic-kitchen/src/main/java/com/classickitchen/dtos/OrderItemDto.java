package com.classickitchen.dtos;

import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;

import com.classickitchen.entities.MenuItem;

import lombok.Data;

@Data
public class OrderItemDto {

    private Long id;

    private OrderDto order;

    private MenuItem item;

    private Integer quantity;
}
