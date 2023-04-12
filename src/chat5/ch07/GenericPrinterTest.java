package src.chat5.ch07;

import src.chat5.ch06.GenericPrinter;
import src.chat5.ch06.Plastic;

public class GenericPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> printer = new GenericPrinter<>();
        printer.setMaterial(powder);

        Powder p = printer.getMaterial();
        System.out.println(printer.toString());

    }

}
