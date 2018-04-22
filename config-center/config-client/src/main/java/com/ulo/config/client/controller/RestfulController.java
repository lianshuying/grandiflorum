package com.ulo.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping(value = "/api/rest")
public class RestfulController {

    @Value("${user.name}")
    String name;
    @Value("${user.age}")
    String age ;

    @GetMapping("/name")
    public String getName(){
        return name +":"+ age;
    }
}