package com.classickitchen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classickitchen.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
