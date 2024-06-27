package config;

import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

    public AppConfig() {
        System.out.println("App Config Object Created");
    }

    @Bean
    public MyConnection getConnecting(){
        return new MyConnection();
    }
}
