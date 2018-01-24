package com.mocha.consumer.controller;

import com.mocha.bean.User;
import com.mocha.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mocha on 2018/1/14.
 */
@RestController
public class ConsumerController {

    @Autowired
    private DemoService service;

    @RequestMapping(value = "/login")
    public String login() {
        System.out.println("mocha");
        User user = new User();
        user.setName("mocha");
        return service.test(user);
    }

}
