package src.chat3.ch11;

public class CalcTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.qwe(num1, num2));
        System.out.println(calc.sad(num1, num2));
        System.out.println(calc.zxc(num1, num2));

    }
}
