package services;

import interfaces.Course;
import interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;


public class Java implements Course {

    private ExtraSession extraSession;

    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (30 + extraSession.getHours()));
    }

    @Value("JD1")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String [] days;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
