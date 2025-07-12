package com.demo.interfaces.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

public interface ISecurity {

    SecurityFilterChain filterChain(HttpSecurity http) throws Exception;

    PasswordEncoder encoder();
}
