package src.chat2.ch08;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order("202011020003", "01023450001",
                "서울시 강남구 역삼동 111-333", "20201102",
                "130258", 35000, "0003");

        System.out.println("주문 접수 번호: " + order.getOrderNum());
        System.out.println("주문 핸드폰 번호: " + order.getPhoneNumber());
        System.out.println("주문 집 주소: " + order.getAddress());
        System.out.println("주문 날짜: " + order.getOrderDate());
        System.out.println("주문 시간: " + order.getOrderTime());
        System.out.println("주문 가격: " + order.getPrice());
        System.out.println("메뉴 번호: " + order.getMenuNum());
    }
}
