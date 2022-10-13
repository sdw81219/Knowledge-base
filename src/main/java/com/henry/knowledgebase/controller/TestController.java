package com.henry.knowledgebase.controller;


import com.henry.knowledgebase.domain.Test;
import com.henry.knowledgebase.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Value("${test.hello}")
    private String testHello;

    @Resource
    private TestService testService;




    @GetMapping ("/hello")
    public String hello(){
        return "Hello World"+testHello;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }

}
