package com.early.autumn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EarlyAutumnEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EarlyAutumnEurekaApplication.class, args);
    }
}
