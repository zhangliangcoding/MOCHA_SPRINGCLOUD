package com.mocha.service;

import com.mocha.bean.User;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Mocha on 2018/1/14.
 */
@FeignClient("demo-service")
public interface DemoService {
    @RequestMapping("login")
    String test(@RequestBody User user);
    @RequestMapping("searchByName")
    User searchByName(@RequestBody String userName);
}
