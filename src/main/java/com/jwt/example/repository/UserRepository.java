package com.jwt.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.example.entity.User;

public interface UserRepository extends JpaRepository<User, Long>
{

	Optional<User> findByEmail(String email);
}
