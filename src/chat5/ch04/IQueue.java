package src.chat5.ch04;

public interface IQueue {
    public void enQueue(String data);

    public String deQueue();

    public void printAll();

    void printQueue();
}
