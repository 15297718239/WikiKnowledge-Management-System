package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/hello")
    public String hello(){
        return "hello world"+testHello;
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello world Post:"+name;
    }
}
