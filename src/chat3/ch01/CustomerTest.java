package src.chat3.ch01;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김아이");
        customerKim.setCustomerId(10011);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
