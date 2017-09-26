package com.chendeyuan.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chendeyuan on 2017/8/27.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
