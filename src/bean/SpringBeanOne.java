package bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    public SpringBeanOne() {
        System.out.println("Object Created from bean one");
    }
}
