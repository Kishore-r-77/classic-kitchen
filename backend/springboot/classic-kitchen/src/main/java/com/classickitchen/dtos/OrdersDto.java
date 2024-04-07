package com.classickitchen.dtos;

import java.math.BigDecimal;
import java.security.Timestamp;

import lombok.Data;

@Data
public class OrdersDto {

    private Long id;

    private String username;

    private BigDecimal totalPrice;

    private String status;

    private Timestamp orderTime;
}
