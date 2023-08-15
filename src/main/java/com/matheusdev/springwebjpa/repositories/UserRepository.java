package com.matheusdev.springwebjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.springwebjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{


}
