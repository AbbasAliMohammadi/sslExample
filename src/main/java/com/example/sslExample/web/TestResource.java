package com.example.sslExample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class TestResource {

    @GetMapping("test")
    public String testMessage(){
        return "test Message";
    }
    
}
