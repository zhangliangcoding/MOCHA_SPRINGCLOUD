package com.mocha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Mocha on 2018/1/21.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigCliendApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCliendApplication.class, args);
    }
}
