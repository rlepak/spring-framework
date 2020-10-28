package com.app.services;


import com.app.interfaces.Course;
import com.app.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Java implements Course {

   private ExtraSession extraSession;

   @Value("${instructor}")
   private String instructor;

   @Autowired
    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours " + (20 + extraSession.getHours()));
        System.out.println(instructor);
    }
}
