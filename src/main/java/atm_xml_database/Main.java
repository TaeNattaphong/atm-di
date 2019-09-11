package atm_xml_database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("xml_config_database/config.xml");
        ATMSimulator atmSimulator = context.getBean("simulator", ATMSimulator.class);
        atmSimulator.run();

    }
}