package com.henry.knowledgebase.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {

    @Value("${test.hello}")
    private String testHello;
    @GetMapping ("/hello")
    public String hello(){
        return "Hello World"+testHello;
    }

}
