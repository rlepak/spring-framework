package com.cybertek.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String getRequestMapping() {
        return "home";
    }

    @RequestMapping( method = RequestMethod.GET, value = "/ozzy")
    public String getRequestMapping2() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cybertek")
    public String getRequestMapping3() {
        return "home";
    }

    @GetMapping("/spring")
    public String getMappingEx(){
        return "home";
    }

    @PostMapping("/spring")
    public String getMappingEx2(){
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String getName(@PathVariable("name") String name, @PathVariable String email){
        System.out.println("name is " + name);
        System.out.println("email is " + email);
        return "home";
    }

//    @GetMapping("/home/course")
//    public String requestParamEx(@RequestParam("course") String course){
//        System.out.println("name is " + course);
//        return "home";
//    }

   @GetMapping("home/course")
    public String requestParam2(@RequestParam(value = "course", required = false, defaultValue = "Cybertek") String name){
       System.out.println("name is " + name);
       return "home";
   }


}
