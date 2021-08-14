package optional.stack_use_array;

public class StackUseArray {
    private static int []arr;
    private int numberElements = 0;
    private int size;

    public StackUseArray(int size) {
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
            System.out.println("Stack empty");
            return -1;
        }
        int numTaken = arr[numberElements-1];
        numberElements--;
        return numTaken;
    }

    public void push(int addNumber){
        if (isFull()) {
            System.out.println("Stack full");
        }else {
            arr[numberElements] = addNumber;
            numberElements++;
        }
    }
}
