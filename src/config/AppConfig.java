package config;

import bean.MyConnection;
import bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

//How to scan POJOs and enter to the Application Context
@Configuration
//@ComponentScan(basePackages = "bean")
@ComponentScan(basePackageClasses = SpringBeanOne.class)
public class AppConfig {

    public AppConfig() {
        System.out.println("App Config Object Created");
    }

    //When we are not allowed to put the @Component annotation we can use this method to
    //Introduce a spring bean to the application context
    @Bean
    public MyConnection getConnecting() {
        return new MyConnection();
    }
}
