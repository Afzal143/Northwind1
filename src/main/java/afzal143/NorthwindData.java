package afzal143;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NorthwindData {

    private static final Logger log = LoggerFactory.getLogger(NorthwindData.class);

    public List<Customer> getCustomers() throws SQLException {

        ResultSet resultSet = null;
        List<Customer> customers = new ArrayList<Customer>();

        try {

            resultSet = DbConnection.getAllCustomers();
            log.info("Retrieving customer information");

            while (resultSet.next()) {
                Customer c = new Customer(resultSet.getString("first_name"), resultSet.getString("last_name"));
                customers.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("cannot retrieve customer objects successfully");
        }
        return customers;
    }

    public Customer getCustomerById(String id) throws SQLException {
        ResultSet resultSet = null;
        Customer c = null;
        try {

            resultSet = DbConnection.findCustomerById(id);
            log.info("Retrieving customer by id information");
            while (resultSet.next()) {
                c = new Customer(resultSet.getString("first_name"), resultSet.getString("last_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("cannot retrieve customer objects by id successfully");
        }
        return c;
    }

    public List<OrderDetails> getOrderDetails() throws SQLException {

        ResultSet resultSet = null;
        List<OrderDetails> orders = new ArrayList<OrderDetails>();

        try {

            resultSet = DbConnection.getOderDetailsbyOrder();
            log.info("retrieving order data ");
            while (resultSet.next()) {
                OrderDetails m = new OrderDetails(resultSet.getInt("customer_id"), resultSet.getString("ship_address"), resultSet.getString("ship_city"), resultSet.getInt("shipping_fee"));
                orders.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("cannot retrieve order details objects successfully");
        }
        return orders;
    }
}
