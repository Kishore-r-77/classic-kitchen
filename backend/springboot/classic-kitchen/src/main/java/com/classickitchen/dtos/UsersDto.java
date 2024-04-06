package com.classickitchen.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsersDto {

    private Long id;

    @NotBlank(message = "The Username Cannot Be Blank")
    private String username;

    @NotBlank(message = "The Password Cannot Be Blank")

    @Min(value = 3, message = "Please Enter More than 3 Characters")
    private String password;

    @Email(message = "Please Enter a Valid Email")
    private String email;

    @Max(value = 3, message = "Phone Code Cannot be more than 3 characters")
    private String phoneCode;

    @Max(value = 10, message = "Phone number cannot be more than 10 characters")
    private Integer phoneNumber;

    private String address;
}
