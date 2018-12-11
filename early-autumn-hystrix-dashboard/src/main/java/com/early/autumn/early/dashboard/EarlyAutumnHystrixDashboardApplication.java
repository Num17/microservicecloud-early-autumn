package com.early.autumn.early.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableHystrixDashboard
public class EarlyAutumnHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(EarlyAutumnHystrixDashboardApplication.class, args);
    }
}
