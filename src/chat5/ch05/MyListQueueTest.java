package src.chat5.ch05;

public class MyListQueueTest {
    public static void main(String[] args) {

        MyListQueue listQueue = new MyListQueue();
        listQueue.enQueue("A");
        listQueue.enQueue("B");
        listQueue.enQueue("V");

        listQueue.printAll();

        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
    }
}
