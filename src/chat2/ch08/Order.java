package src.chat2.ch08;

public class Order {
    private String orderNum;
    private String phoneNumber;
    private String address;
    private String orderDate;
    private String orderTime;
    private int price;
    private String menuNum;

    public Order(String orderNum, String phoneNumber, String address,
                 String orderDate, String orderTime, int price, String menuNum) {
        this.orderNum = orderNum;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.price = price;
        this.menuNum = menuNum;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public int getPrice() {
        return price;
    }

    public String getMenuNum() {
        return menuNum;
    }
}