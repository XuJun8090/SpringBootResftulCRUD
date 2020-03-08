package com.xujun.springbootrestfulcrud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuJun
 * @create 2020-03-08 11:34
 **/
@RestController
public class HelloWorldController {

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello myFirst SpringBoot test";
    }
}
