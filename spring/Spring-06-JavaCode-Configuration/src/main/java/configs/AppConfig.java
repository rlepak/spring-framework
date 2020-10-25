package configs;

import interfaces.ExtraSession;
import org.springframework.context.annotation.*;
import services.Java;
import services.OfficeHours;
import services.Selenium;

@Configuration
@ComponentScan("services")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public Java java(){
        return new Java(extraSession());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

//    @Bean
//    public OfficeHours officeHours(){
//        return new OfficeHours();
//    }

    @Bean
    public ExtraSession extraSession(){//ExtraSession ex = new OfficeHours();
        return new OfficeHours();
    }

}
