import bean.springBeanOne;
import bean.springBeanThree;
import bean.springBeanTwo;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//POJO driven approach / Annotation Driven
public class AppInitializer {
    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to shut down");
            }
        }));

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        ctx.getBean(springBeanOne.class);
        ctx.getBean(springBeanTwo.class);
        ctx.getBean(springBeanThree.class);

        ctx.close();

    }
}
