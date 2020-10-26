package services;

import interfaces.Course;

import interfaces.ExtraSessions;
import org.springframework.stereotype.Controller;

@Controller
public class Java implements Course {

//    ExtraSessions extraSessions;

    OfficeHours officeHours;

//    public Java(ExtraSessions extraSessions) {
//        this.extraSessions = extraSessions;
//    }


    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + officeHours.getHours()));
    }




}
