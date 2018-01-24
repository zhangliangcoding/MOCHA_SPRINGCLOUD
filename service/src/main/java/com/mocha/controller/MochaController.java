package com.mocha.controller;

import com.mocha.bean.User;
import com.mocha.service.DemoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mocha on 2017/11/25.
 */
@RestController
public class MochaController implements DemoService{
    @RequestMapping("login")
    public String test(@RequestBody User user) {
        if (user.getName().equals("mocha")) {
            User user1 = searchByName(user.getName());
            return user1.getName()+"/"+user1.getPwd();
        }
        return null;
    }

    @RequestMapping("searchByName")
    public User searchByName(@RequestBody String userName) {
        User user = new User();
        user.setName("mocha");
        user.setPwd("123");
        return user;
    }
}
