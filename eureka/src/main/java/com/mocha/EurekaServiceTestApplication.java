package com.mocha;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Mocha on 2017/11/4.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceTestApplication.class, args);
    }
}
