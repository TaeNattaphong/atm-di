package atm_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSource dataSource = new DataSource("customers.txt");
//        Bank bank = new Bank(dataSource);
//        ATM atm_xml = new ATM(bank);
//        ATMSimulator atmSimulator = new ATMSimulator(atm_xml);
//        atmSimulator.run();

        ApplicationContext context = new ClassPathXmlApplicationContext("xml_config_jbdc/config.xml");
        ATMSimulator atmSimulator = context.getBean("ATMSimulator", ATMSimulator.class);
        atmSimulator.run();

    }
}