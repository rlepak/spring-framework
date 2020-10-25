package services;

import interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Java implements Course {


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 30");
    }
}
