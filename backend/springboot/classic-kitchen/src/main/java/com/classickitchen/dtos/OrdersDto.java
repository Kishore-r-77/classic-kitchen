package com.classickitchen.dtos;

import java.math.BigDecimal;
import java.security.Timestamp;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class OrdersDto {

    private Long id;

    @NotBlank(message = "User name Cannot be Empty")
    private String username;

    private BigDecimal totalPrice;

    private String status;

    private Timestamp orderTime;
}
