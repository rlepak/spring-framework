package com.cybertek.controller;


import com.cybertek.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model) {
        String date = String.valueOf(LocalDateTime.now());

        model.addAttribute("name", "Ozzy");
        model.addAttribute("date", date);

        List<Integer> numbers = Arrays.asList(4,6,3,6,8,8);
        model.addAttribute("numbers", numbers);

        Student student = new Student("1", "Mike", "Smith");
        model.addAttribute("student", student);

        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2(){
        return "student/register";
    }
}
