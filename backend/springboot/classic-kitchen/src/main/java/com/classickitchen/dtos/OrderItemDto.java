package com.classickitchen.dtos;

import com.classickitchen.entities.MenuItem;

import lombok.Data;

@Data
public class OrderItemDto {

    private Long id;

    private String order;

    private MenuItem item;

    private Integer quantity;
}
