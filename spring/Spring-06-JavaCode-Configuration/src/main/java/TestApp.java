import configs.AppConfig;
import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {


    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        Course course = container.getBean("java", Course.class);

        Course course1 = container.getBean("java", Course.class);

        System.out.println(course.toString());

        System.out.println(course.toString());
        course.getTeachingHours();

    }
}
