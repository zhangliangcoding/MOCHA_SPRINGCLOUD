package com.mocha.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Mocha on 2018/1/14.
 */
@EnableFeignClients(basePackages = "com.mocha")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.mocha")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
