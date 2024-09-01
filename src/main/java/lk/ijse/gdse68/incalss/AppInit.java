package lk.ijse.gdse68.incalss;

import lk.ijse.gdse68.incalss.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppInit {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Config.class);
        applicationContext.refresh();
        applicationContext.registerShutdownHook();

    }


}

