package fan.stu.springannotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        HelloJapan helloJapan = context.getBean(HelloJapan.class);

        helloWorld.getMessage();
        helloJapan.getMessage();

        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();
        context2.register(HelloWorldConfig.class);
        context2.register(HelloVietNamConfig.class);
        context2.refresh();

        HelloWorld helloWorld2 = context2.getBean(HelloWorld.class);
        HelloJapan helloJapan2 = context2.getBean(HelloJapan.class);
        HelloVietNam helloVietNam2 = context2.getBean(HelloVietNam.class);

        helloWorld2.getMessage();
        helloJapan2.getMessage();
        helloVietNam2.getMessage();
        
    }
}
