package com.vendingmachine.springboot.models;

import com.vendingmachine.springboot.utils.Role;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quoteID")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private Role role;

    @Column(name = "deposit")
    private BigDecimal deposit;

//    public User(String username, String password, Role role, BigDecimal deposit)
//    {
//        this.username = username;
//        this.password = password;
//        this.role = role;
//        this.deposit = deposit;
//    }


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Role getRole()
    {
        return role;
    }

    public void setRole(Role role)
    {
        this.role = role;
    }

    public BigDecimal getDeposit()
    {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit)
    {
        this.deposit = deposit;
    }
}
