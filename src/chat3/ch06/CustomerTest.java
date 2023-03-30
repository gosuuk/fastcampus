package src.chat3.ch06;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerT = new Customer(10010, "Tomas");
        Customer customerP = new Customer(10020, "김유신");
        Customer customerA= new GoldCustomer(10030, "이순신");
        Customer customerR = new GoldCustomer(10040, "park");
        Customer customerK = new VIPCustomer(10050, "kim");

        customerList.add(customerA);
        customerList.add(customerP);
        customerList.add(customerA);
        customerList.add(customerR);
        customerList.add(customerK);

        for( Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }
        int price = 10000;
        for (Customer customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName()+ "님이" + cost + "원을 지불하셨습니다.");
            System.out.println(customer.getCustomerName()+ "님의 현재 보너스 포인트는" + customer.bonusPoint + " 입니다.");
        }
    }
}

