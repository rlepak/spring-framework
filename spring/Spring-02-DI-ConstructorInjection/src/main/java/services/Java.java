package services;

import interfaces.Course;

import interfaces.ExtraSessions;
import org.springframework.stereotype.Controller;

@Controller
public class Java implements Course {

    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraSessions.getHours()));
    }

}
