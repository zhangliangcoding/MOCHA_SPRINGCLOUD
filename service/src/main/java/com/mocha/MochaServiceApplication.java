package com.mocha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Mocha on 2017/11/25.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MochaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MochaServiceApplication.class,args);
    }
}
