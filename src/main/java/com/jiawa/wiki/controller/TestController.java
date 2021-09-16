package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author zengjinming
 * @Date 2021/9/16 21:11
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
