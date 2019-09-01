package com.hhit.hheureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HheurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HheurekaApplication.class, args);
    }

}
