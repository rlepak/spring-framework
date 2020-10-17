package services;

import interfaces.Mentor;

public class FullTImeMentor implements Mentor {

    @Override
    public void createAccount() {
        System.out.println("Full Time Mentor is created");
    }
}
