package com.vendingmachine.springboot.models;

import com.vendingmachine.springboot.utils.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userId;

    @NotNull
    @Column(name = "username", unique = true)
    private String username;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "role")
    private Role role;

    @NotNull
    @Column(name = "deposit")
    private BigDecimal deposit;

    public int getId()
    {
        return userId;
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

    public void setRole(String role)
    {
        this.role = Role.valueOf(role);
    }

    public void setRole(Role role) {
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
