package com.mocha;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Mocha on 2018/1/14.
 */
@EnableZuulProxy
@SpringCloudApplication
public class GateWayApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GateWayApplication.class).web(true).run(args);
    }
}
