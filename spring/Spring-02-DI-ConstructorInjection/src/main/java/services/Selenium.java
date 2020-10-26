package services;

import interfaces.Course;
import interfaces.ExtraSessions;

public class Selenium implements Course {

    ExtraSessions extraSessions;

    public Selenium(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 15" + extraSessions.getHours());
    }
}
