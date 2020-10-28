package com.app.services;


import com.app.interfaces.Course;
import org.springframework.stereotype.Component;



@Component
public class Java implements Course {


    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours 20");
    }
}
