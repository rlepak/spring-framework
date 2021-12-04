package com.mockmvc.controller;

import com.mockmvc.entity.Student;
import com.mockmvc.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }


    @GetMapping("/data")
    List<Student> getStudentData(){
        return service.getStudentData();
    }

}
