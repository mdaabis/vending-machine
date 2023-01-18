package com.vendingmachine.springboot.repositories;

import com.vendingmachine.springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

//    @Param("username")
//    @Query("SELECT u FROM User u WHERE u.username = ?1")
//    List<User> getUsers(String username);

    @Query(value = "SELECT * FROM users WHERE username = :username", nativeQuery = true)
    List<User> findByUsername(@Param("username") String username);

//    @Query("SELECT u FROM User u WHERE u.username")
//    List<User> getUserViaUsername();

//    @Query("SELECT u FROM User u WHERE u.username like :username%")
//    List<User> findByUsenameStartingWith(String username);
}

