package optional.queue_use_array;

public class QueueUseArrayTest {
    public static void main(String[] args) {
        QueueUseArray queueUseArray = new QueueUseArray(5);
        queueUseArray.push(5);
        queueUseArray.push(2);
        queueUseArray.push(3);
        queueUseArray.push(4);
        queueUseArray.push(1);

        System.out.println(queueUseArray.isFull());

        System.out.println(queueUseArray.pop());
    }
}
