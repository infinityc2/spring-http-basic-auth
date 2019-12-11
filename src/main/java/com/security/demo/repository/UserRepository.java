package com.security.demo.repository;

import java.util.Optional;

import com.security.demo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByUsername(String username);
}