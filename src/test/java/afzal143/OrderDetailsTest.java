package afzal143;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by afzal on 9/22/17.
 */
public class OrderDetailsTest {
    @Test
    public void getcustomer_info() throws Exception {
        OrderDetails info = new OrderDetails(10, "40 plainsboro","Princeton", 24 );
        assertEquals(10, info.getcustomer_id());
        assertEquals("40 plainsboro", info.getship_address());
        assertEquals("Princeton", info.getship_city());
        assertEquals(24, info.getshipping_fee());



    }



}