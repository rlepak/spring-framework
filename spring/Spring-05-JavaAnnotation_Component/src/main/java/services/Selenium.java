package services;

import interfaces.Course;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 25");

    }
}
