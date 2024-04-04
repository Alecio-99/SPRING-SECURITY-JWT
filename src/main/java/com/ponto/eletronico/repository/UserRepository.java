package com.ponto.eletronico.repository;

import com.ponto.eletronico.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepository  extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
