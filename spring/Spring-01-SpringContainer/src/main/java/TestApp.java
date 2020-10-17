import interfaces.Mentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor = container.getBean("fullTimeMentor", Mentor.class);

        mentor.createAccount();


    }
}
