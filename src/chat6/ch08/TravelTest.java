package src.chat6.ch08;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("이순신" ,40, 100);
        TravelCustomer customerLe = new TravelCustomer("이성계" ,20, 100);
        TravelCustomer customerL = new TravelCustomer("이무" ,10, 50);

        List<TravelCustomer> customers = new ArrayList<>();
        customers.add(customerLee);
        customers.add(customerLe);
        customers.add(customerL);

        System.out.println("고객 명단 출력");
        customers.stream().map(c->c.getName()).forEach(s -> System.out.println(s));

        System.out.println("여행비용");
        System.out.println(customers.stream().mapToInt(c->c.getPrice()).sum());

        System.out.println("20세 이상 고객");
        customers.stream().filter(c->c.getAge() >=20).map(c->c.getName()).sorted().forEach(s -> System.out.println(s));
    }
}
