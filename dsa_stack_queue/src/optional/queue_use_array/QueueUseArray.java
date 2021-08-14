package optional.queue_use_array;

public class QueueUseArray {
    private static int []arr;
    private int numberElements = 0;
    private int size;

    public QueueUseArray(int size) {
        this.size = size;
        arr = new int[this.size];
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
        int numTaken = arr[0];
        numberElements--;
        for (int i = 0; i < numberElements -1; i++) {
            arr[i] = arr[i+1];
        }
        return numTaken;
    }

    public void push(int addNumber){
        if (isFull()) {
            System.out.println("Queue full");
        }else {
            arr[numberElements] = addNumber;
            numberElements++;
        }
    }
}
