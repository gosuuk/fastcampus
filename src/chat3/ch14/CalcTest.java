package src.chat3.ch14;

public class CalcTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.qwe(num1, num2));
        System.out.println(calc.sad(num1, num2));
        System.out.println(calc.zxc(num1, num2));

        calc.description();

        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));
    }
}
