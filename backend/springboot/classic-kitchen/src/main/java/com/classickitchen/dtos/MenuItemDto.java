package com.classickitchen.dtos;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class MenuItemDto {

    private Long id;

    private String username;

    private String name;

    private String description;

    private BigDecimal price;

    private String category;
}
