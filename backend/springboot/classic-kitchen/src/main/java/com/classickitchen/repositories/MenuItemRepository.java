package com.classickitchen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classickitchen.entities.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

}
