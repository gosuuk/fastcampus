package src.chat5.ch06;

public class ThreeDprinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        ThreeDprinter1 threeDprinter1 = new ThreeDprinter1();

        threeDprinter1.setMaterial(powder);

        Powder p = (Powder) threeDprinter1.getMaterial();
    }
}
