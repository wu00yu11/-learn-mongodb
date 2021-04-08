package com.learn.mongodb.controller;

import com.learn.mongodb.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
@Slf4j
public class HelloController {

    @Autowired
    private HelloService helloService;

    @PostMapping(value = "/add")
    public String add(){
        helloService.add();
        return "hello";
    }
}
