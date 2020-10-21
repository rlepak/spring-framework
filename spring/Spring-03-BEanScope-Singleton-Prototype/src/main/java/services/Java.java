package services;

import interfaces.Course;
import org.springframework.stereotype.Controller;

@Controller
public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : ");
    }

}
