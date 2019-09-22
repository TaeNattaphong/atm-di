package atm_jdbc.Strategy;

import atm_jdbc.JDBCConfig.CustomerDataAccessObject;
import atm_jdbc.JDBCConfig.CustomersDataAccessImprement;
import atm_jdbc.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadFromDatabaseJDBC implements ReadDataSource {
    public Map<Integer, Customer> readCustomers() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml_config_jbdc/config.xml");
        CustomerDataAccessObject customersDaoi = context.getBean("customerDataAccessObjectImp", CustomersDataAccessImprement.class);

        Map<Integer, Customer> mapCustomer = new HashMap<Integer, Customer>();
        List<Customer> customers = customersDaoi.findAll();
        for (Customer customer : customers) {
            mapCustomer.put(customer.getCustomerNumber(), customer);
        }
        return mapCustomer;
    }
}
