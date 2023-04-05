package src.chat3.ch15;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("지리산1");
        bookQueue.enQueue("지리산2");
        bookQueue.enQueue("지리산3");
        bookQueue.enQueue("지리산4");
        bookQueue.enQueue("지리산5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());


    }
}
