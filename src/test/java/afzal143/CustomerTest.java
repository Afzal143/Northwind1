package afzal143;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by afzal on 9/22/17.
 */
public class CustomerTest {
    @org.junit.Test
    public void getfirstName() throws Exception {
        Customer name = new Customer("Afzal", "Hossain");
        assertEquals("Afzal", name.getfirstName());




    }

    @org.junit.Test
    public void getlastName() throws Exception {
        Customer name = new Customer("Afzal", "Hossain");
        assertEquals("Hossain", name.getlastName());


    }

}