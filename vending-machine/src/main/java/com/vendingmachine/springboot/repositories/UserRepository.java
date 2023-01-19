package com.vendingmachine.springboot.repositories;

import com.vendingmachine.springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>
{

    @Query(value = "SELECT * FROM users u WHERE u.username LIKE %:usernameSubstring%", nativeQuery = true)
    List<User> getUsers(String usernameSubstring);

    @Query(value = "SELECT * FROM users WHERE username = :username", nativeQuery = true)
    List<User> findByUsername(@Param("username") String username);
}

