package com.hhit.hhzuul;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig {
    @Bean
    public PermisFilter getAuthorizedRequestFilter() {
        return new PermisFilter() ;
    }
}