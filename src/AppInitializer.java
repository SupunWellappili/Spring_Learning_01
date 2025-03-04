import bean.MyConnection;
import bean.SpringBeanOne;
import bean.SpringBeanTwo;
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


        /*SpringBeanOne beanOne = ctx.getBean(SpringBeanOne.class);
        System.out.println(beanOne);

        SpringBeanTwo beanTwo = ctx.getBean(SpringBeanTwo.class);
        System.out.println(beanTwo);

        SpringBeanThree beanThree = ctx.getBean(SpringBeanThree.class);
        System.out.println(beanThree);*/


        //Bean Name Request (Bean ID)
        //First Letter Simple
       /* Object springBeanOne = ctx.getBean("springBeanOne");
        System.out.println(springBeanOne);*/

        /*SpringBeanOne springBeanOne = (SpringBeanOne) ctx.getBean("springBeanOne");
        System.out.println(springBeanOne);

        Object springBeanTwo  =  ctx.getBean("springBeanTwo");
        System.out.println(springBeanTwo);

        Object springBeanThree =  ctx.getBean("SpringBeanThree");
        System.out.println(springBeanThree);*/

        //MyConnection --> myConnection //no
        //@Bean -- Bean ID --> Bean method name //yes
        MyConnection myConnection = (MyConnection) ctx.getBean("getConnecting");
        System.out.println(myConnection);

        MyConnection myConnection2 = (MyConnection) ctx.getBean("getConnecting");
        System.out.println(myConnection2);

        //Singleton Objects
        SpringBeanOne ref1 = ctx.getBean(SpringBeanOne.class);
        SpringBeanOne ref2 = ctx.getBean(SpringBeanOne.class);
        System.out.println(ref1 + " : " + ref2);

        SpringBeanTwo b2ref1 = ctx.getBean(SpringBeanTwo.class);
        SpringBeanTwo b2ref2 = ctx.getBean(SpringBeanTwo.class);
        System.out.println(b2ref1+" : "+b2ref2 );

        ctx.close();


    }
}
