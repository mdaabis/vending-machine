package com.vendingmachine.springboot.security;

import com.vendingmachine.springboot.models.User;
import com.vendingmachine.springboot.repositories.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class SecurityUserLoader implements UserDetailsService
{
    private final UserRepository userRepository;

    public SecurityUserLoader(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User loadedUser = userRepository.findByUsername(username);
        if (loadedUser == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(
                loadedUser.getUsername(),
                loadedUser.getPassword(),
                true,
                true,
                true,
                true,
                Collections.singleton(new SimpleGrantedAuthority("ROLE_" + loadedUser.getRole().toString()))
        );
    }


}
