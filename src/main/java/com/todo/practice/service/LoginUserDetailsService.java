package com.todo.practice.service;

import com.todo.practice.Entity.User;
import com.todo.practice.Repo.LoginUser;
import com.todo.practice.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class LoginUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user=repo.findByname(username);
         User u= user.orElseThrow(()-> new UsernameNotFoundException("User not found"));
        return new LoginUser(u);
    }
}
