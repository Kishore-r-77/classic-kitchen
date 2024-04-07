package com.classickitchen.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.classickitchen.dtos.MenuItemDto;
import com.classickitchen.dtos.OrderItemDto;
import com.classickitchen.dtos.OrdersDto;
import com.classickitchen.dtos.UsersDto;
import com.classickitchen.entities.MenuItem;
import com.classickitchen.entities.OrderItem;
import com.classickitchen.entities.Orders;
import com.classickitchen.entities.Users;

@Mapper
public interface AutoMapper {

    AutoMapper mapper = Mappers.getMapper(AutoMapper.class);

    // Converting to Dtos
    public UsersDto mapToUser(Users users);

    @Mapping(source = "user.username", target = "username")
    public MenuItemDto mapToMenuItem(MenuItem menuItem);

    @Mapping(source = "user.username", target = "username")
    public OrdersDto mapToUser(Orders orders);

    public OrderItemDto mapToUser(OrderItem orderItem);

    // Converting to Entities
    public Users mapToUserDto(UsersDto usersDto);

    public MenuItem mapToMenuItemDto(MenuItemDto menuItemDto);

    public Orders mapToUserDto(OrdersDto ordersDto);

    public OrderItem mapToUserDto(OrderItemDto orderItemDto);

}
