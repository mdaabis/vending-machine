package com.vendingmachine.springboot.repositories;

import com.vendingmachine.springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>
{
    User findByUsername(String username) throws UsernameNotFoundException;
    boolean existsByUsername(String username);

    @Query(value = "SELECT * FROM users u WHERE u.username LIKE ?:usernameSubstring?", nativeQuery = true)
    List<User> getUsers(String usernameSubstring);

//    // TODO: 21/01/2023 implement endpoint in controller
//    @Query(value = "SELECT * FROM users WHERE username = :username", nativeQuery = true)
//    List<User> findByUsername(String username);

//    @Query(value = "SELECT COUNT(u.username) from users u WHERE username = :username", nativeQuery = true)
//    long userExists(String username);
}

