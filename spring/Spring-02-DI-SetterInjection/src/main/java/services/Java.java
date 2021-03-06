package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import lombok.Data;
import org.springframework.stereotype.Controller;

@Data
public class Java implements Course {

//    private OfficeHours officeHours;
    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraSessions.getHours()));
    }

}
