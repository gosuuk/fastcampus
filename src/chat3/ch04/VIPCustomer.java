package src.chat3.ch04;

public class VIPCustomer extends Customer {
    double salesRatio;
    private String agentID;
    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    public String getAgentID() {

        return agentID;
    }

}
