package bean;

import org.springframework.stereotype.Component;

@Component("SpringBeanThree")
public class SpringBeanThree {
    public SpringBeanThree() {
        System.out.println("Object Created from bean three");
    }
}
