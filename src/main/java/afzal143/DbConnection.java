package afzal143;
import java.sql.*;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class DbConnection {

    private static final Logger logger = LoggerFactory.getLogger(DbConnection.class);

    private static Connection conn = null;

    private String connurl = null;
    private String driverClass = null;
    private String pass = null;
    private String usrname = null;
    private static PreparedStatement ps = null;


    public DbConnection(String driverClass, String url, String usrname, String pass) throws ClassNotFoundException, SQLException {
        this.driverClass = driverClass;
        this.connurl = url;
        this.usrname = usrname;
        this.pass = pass;
        Class.forName(driverClass);
        conn = DriverManager.getConnection(connurl, usrname, pass);
        logger.info("DB Connection Established");
        System.out.println("DB connected !!!");
    }

    public static ResultSet findCustomerById(String s) {
        ResultSet rs = null;
        try {
            logger.info(" SQL command executing");
            ps = conn.prepareStatement("SELECT * FROM northwind.customers where id=?;");

            int sint=Integer.parseInt(s);
            ps.setInt(1, sint);
            rs = ps.executeQuery();
        } catch (Exception ex) {
            System.out.print("Error");
            logger.warn("be careful");
        }
        return rs;
    }


    public static ResultSet getAllCustomers() {
        ResultSet result = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM northwind.customers limit 10");
            result = ps.executeQuery();
            logger.info(" SQL command executing");
        } catch (Exception ex) {
            System.out.print("Error");
            logger.warn("be careful while retrieving customers");
        }
        return result;
    }

    public static ResultSet getOderDetailsbyOrder() {
        ResultSet resu = null;
        try {

            ps = conn.prepareStatement("SELECT customer_id,ship_address,ship_city, shipping_fee FROM northwind.orders ");
            resu = ps.executeQuery();
            logger.info(" SQL command executing");
        } catch (Exception ex) {
            System.out.print("Error");
            logger.warn("error executing getorderdetails");
        }
        return resu;
    }
}
