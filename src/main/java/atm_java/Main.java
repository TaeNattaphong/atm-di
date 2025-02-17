package atm_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        ATMSimulator atmSimulator = context.getBean(ATMSimulator.class);
        atmSimulator.run();

    }
}