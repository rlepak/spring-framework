package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.stereotype.Controller;

@Controller
public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : ");
    }

}
