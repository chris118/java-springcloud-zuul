package com.hhit.hhzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class HhzuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(HhzuulApplication.class, args);
    }

}
