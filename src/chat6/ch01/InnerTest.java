package src.chat6.ch01;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {
        int iNum = 100;
        static int sInNum = 500;

        void inTest() {
            System.out.println("OutClass num = " + num + "외부 클래스의 인스턴스 변수");
            System.out.println("OutClass num = " + sNum + "외부 클래스의 인스턴스 변수");
            System.out.println("OutClass num = " + iNum + "외부 클래스의 인스턴스 변수");
        }
    }

    public void usingClass() {
        inClass.inTest();
    }

    static Class InStaticClass() {

        int iNum = 100;
        int sInNum = 200;
        return null;
    }
}
public class InnerTest {
    public static void main(String[] args) {

        OutClass outClass = new OutClass();
        outClass.usingClass();
        System.out.println();
        }
    }
