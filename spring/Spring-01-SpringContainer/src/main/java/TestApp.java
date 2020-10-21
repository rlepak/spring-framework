import interfaces.Mentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor = container.getBean("fullTimeMentor", Mentor.class);

        Mentor mentor1 = container.getBean("partTimeMentor", Mentor.class);

        mentor.createAccount();
        mentor1.createAccount();


    }
}
