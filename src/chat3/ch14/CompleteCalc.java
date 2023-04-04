package src.chat3.ch14;

import src.chat3.ch11.Calculator;

public class CompleteCalc extends Calculator {
    @Override
    public int qwe(int num1, int num2) {
        return num1*num2;
    }
    @Override
    public int zxc(int num1, int num2) {
        if(num2 == 0)
            return ERRoR;
        return num1/num2;
    }
    public void showInfo() {
        System.out.println("모두 구현했습니다.");
    }
    @Override
    public void description() {
        System.out.println("CompleteCale overriding");
    }
}
