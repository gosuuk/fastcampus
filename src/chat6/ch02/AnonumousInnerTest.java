package src.chat6.ch02;

class Outer2 {
    int outNum = 100;
    static int sNum = 200;
    Runnable getRunnable(int i) {
        int num = 10;
        return new Runnable() {
            @Override
            public void run() {
                int localNum = 1000;
                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);
                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 인스턴스 변수)");

            }
        };
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable calss");
        }
    };
}
public class AnonumousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);
        runner.run();
    }
}
