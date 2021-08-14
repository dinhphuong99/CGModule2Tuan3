package practice.stack_use_linkedlist;

import java.util.LinkedList;

public class StackUseLinkedList {
    private static LinkedList arrayList = new LinkedList();
    private int numberElements = 0;
    private int size;

    public StackUseLinkedList(int size) {
        this.size = size;
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
            System.out.println("Stack empty");
            return -1;
        }
        int numGet = (int) arrayList.get(numberElements-1);
        arrayList.remove(numberElements-1);
        numberElements--;
        return numGet;
    }

    public void push(int addNumber){
        if (isFull()) {
            System.out.println("Stack full");
        }else {
            arrayList.add(addNumber);
            numberElements++;
        }
    }
}
