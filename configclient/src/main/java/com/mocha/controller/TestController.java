package com.mocha.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mocha on 2018/1/21.
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${from}")
    private String from;
    @Value("${test}")
    private String test;

    @RequestMapping("from")
    public String from() {
        return this.from + "/" + this.test;
    }
}
