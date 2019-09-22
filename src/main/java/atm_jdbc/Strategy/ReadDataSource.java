package atm_jdbc.Strategy;

import atm_jdbc.Customer;

import java.io.IOException;
import java.util.Map;

public interface ReadDataSource {
    public Map<Integer, Customer> readCustomers() throws IOException;
}
