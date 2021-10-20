package com.github.learngithub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/hello")
    public String myName(){
        return  "Welcome to Github, Adil!";
    }

    @RequestMapping("/hello-copy")
    public String myNameCopy(){
        return  "Welcome to Github, Adil!";
    }
}
