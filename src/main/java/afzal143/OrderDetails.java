package afzal143;

public class OrderDetails {
    private int customer_id;
    private String ship_address;
    private String ship_city;
    private int shipping_fee;

    public OrderDetails(int customer_id, String ship_address, String ship_city, int shipping_fee) {
        this.customer_id = customer_id;
        this.ship_address = ship_address;
        this.ship_city = ship_city;
        this.shipping_fee = shipping_fee;
    }

    public int getcustomer_id() {
        return customer_id;
    }

    public String getship_address() {
        return ship_address;
    }

    public String getship_city() {
        return ship_city;
    }

    public int getshipping_fee() {
        return shipping_fee;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setShip_address(String ship_address) {
        this.ship_address = ship_address;
    }

    public void setShip_city(String ship_city) {
        this.ship_city = ship_city;
    }

    public void setShipping_fee(int shipping_fee) {
        this.shipping_fee = shipping_fee;
    }
}