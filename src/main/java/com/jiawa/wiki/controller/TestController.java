package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author zengjinming
 * @Date 2021/9/16 21:11
 */
@RestController
public class TestController {
    @Value("${test.hello}")
    private String testHello;
    @Autowired
    private TestService testService;
    @GetMapping("/hello")
    public String hello(){
        return "hello world"+testHello;
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello world Post:"+name;
    }
    @GetMapping("/list")
    public List<Test> list(){
        return testService.list();
    }

}
