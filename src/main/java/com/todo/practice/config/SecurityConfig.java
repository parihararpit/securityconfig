package com.todo.practice.config;

import com.todo.practice.service.LoginUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService()
    {
//        InMemoryUserDetailsManager inMemoryUserDetailsManager=new InMemoryUserDetailsManager();
//        UserDetails usd= User.withUsername("Arjun")
//                .password("Jaadu")
//                .authorities("read").build();
//
//        inMemoryUserDetailsManager.createUser(usd);
//        return inMemoryUserDetailsManager;
        return new LoginUserDetailsService();
    }
    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return NoOpPasswordEncoder.getInstance();
    }


}
