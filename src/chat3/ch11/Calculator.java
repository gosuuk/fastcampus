package src.chat3.ch11;

public abstract class Calculator implements Calc{
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
    @Override
    public int sad(int num1, int num2) {
        return num1-num2;
    }

    public abstract void description();
}
