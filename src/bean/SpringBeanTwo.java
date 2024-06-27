package bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo {
    public SpringBeanTwo() {
        System.out.println("Object Created from bean two");
    }
}
