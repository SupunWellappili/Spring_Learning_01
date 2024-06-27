import bean.SpringBeanOne;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//POJO driven approach / Annotation Driven
public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        //Runtime something just before jvm shutdown
       /* Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to shut down");
                ctx.close();
            }
        }));*/

        ctx.registerShutdownHook();

        /*ctx.getBean(springBeanOne.class);
        ctx.getBean(springBeanTwo.class);
        ctx.getBean(springBeanThree.class);*/


        //Bean Name Request (Bean ID)
        //First Letter Simple
       /* Object springBeanOne = ctx.getBean("springBeanOne");
        System.out.println(springBeanOne);*/
        SpringBeanOne springBeanOne = (SpringBeanOne) ctx.getBean("springBeanOne");
        System.out.println(springBeanOne);

        Object springBeanTwo  =  ctx.getBean("springBeanTwo");
        System.out.println(springBeanTwo);

        Object springBeanThree =  ctx.getBean("springBeanThree");
        System.out.println(springBeanThree);

    }
}
