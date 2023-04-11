package src.chat5.ch05;

import src.chat5.ch03.MyLinkedList;
import src.chat5.ch03.MyListNode;
import src.chat5.ch04.IQueue;

public class MyListQueue extends MyLinkedList implements IQueue {

    MyListNode front;
    MyListNode rear;


    public MyListQueue()
    {
        front = null;
        rear = null;
    }
    @Override
    public void enQueue(String data)
    {
        MyListNode newNode;
        if(isEmpty()){
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }
        else
        {
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + " added");
    }
    @Override
    public String deQueue()
    {
        if(isEmpty()){
            return null;
        }
        String data = front.getData();
        front = front.next;
        if( front == null ){
            rear = null;
        }
        return data;
    }
    @Override
    public void printQueue()
    {
        printAll();

    }
}
