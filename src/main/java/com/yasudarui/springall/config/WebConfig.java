package com.yasudarui.springall.config;

import com.yasudarui.springall.common.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Bean()
    public User user() {
        return new User("yasudarui", 18);
    }
}