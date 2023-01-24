package com.vendingmachine.springboot.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration
{
    @Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception
    {
        return httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("users").hasAnyAuthority("ROLE_BUYER", "ROLE_SELLER")// Allow all create requests without authentication.and()
//                        .requestMatchers("create-user").hasAnyAuthority("ROLE_SELLER")
                        .anyRequest().authenticated()
                        )
                .formLogin(withDefaults())
                .httpBasic(withDefaults())
                .build();
    }

//    @Bean
//    public PasswordEncoder passwordEncoder()
//    {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }
}
