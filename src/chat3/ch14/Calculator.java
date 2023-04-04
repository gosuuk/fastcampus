package src.chat3.ch14;

import src.chat3.ch11.Calc;

public abstract class Calculator implements Calc {
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
    @Override
    public int sad(int num1, int num2) {
        return num1-num2;
    }
}
