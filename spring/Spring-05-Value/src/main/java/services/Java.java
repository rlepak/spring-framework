package services;

import interfaces.Course;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Data
public class Java implements Course {

    @Value("JD1")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String [] days;



    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + 30);
    }
}
