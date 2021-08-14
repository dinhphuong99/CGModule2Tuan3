package practice.queue_use_linkedlist;

import java.util.LinkedList;

public class QueueUseLinkedList {
    private static LinkedList arrayList = new LinkedList();
    private int numberElements = 0;
    private int size;

    public QueueUseLinkedList(int size) {
        this.size = size;
    }

    public QueueUseLinkedList(){

    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty(){
        if (numberElements == 0)
            return true;
        return false;
    }

    public boolean isFull(){
        if (numberElements >= size)
            return true;
        return false;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Queue empty");
            return -1;
        }
        int numGet = (int) arrayList.get(0);
        arrayList.remove(0);
        numberElements--;
        return numGet;
    }

    public void push(int addNumber){
        if (isFull()) {
            System.out.println("Queue full");
        }else {
            arrayList.add(addNumber);
            numberElements++;
        }
    }
}
