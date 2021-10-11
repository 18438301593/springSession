package com.example.controller;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestPbController {

    @GetMapping("set")
    public String set(HttpSession session,String value){
        session.setAttribute("name",value);
        return "ok";
    }


    @GetMapping("get")
    public String set(HttpSession session){
        String value = (String)session.getAttribute("name");
        return value;
    }

}
