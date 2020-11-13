package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

//    @RequestMapping("/home")
    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String getRequestMapping1(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/home")
    public String getRequestMapping2(){
        return "home";
    }

    @GetMapping("/spring")
    public String getMapping(){
        return "home";
    }

    @PostMapping("/spring")
    public String getMapping1(){
        return "home";
    }


























}
