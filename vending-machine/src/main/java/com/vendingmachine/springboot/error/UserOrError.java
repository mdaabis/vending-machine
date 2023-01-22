package com.vendingmachine.springboot.error;

import com.vendingmachine.springboot.models.User;
import org.springframework.http.HttpStatus;

public class UserOrError
{
    private User user;
    private HttpStatus status;
    private String message;

    public UserOrError(User user, HttpStatus status, String message) {
        this.user = user;
        this.status = status;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
