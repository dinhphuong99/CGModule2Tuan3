package practice.queue_use_linkedlist;

public class QueueUseLinkedListTest {
    public static void main(String[] args) {
        QueueUseLinkedList queueUseLinkedList = new QueueUseLinkedList(5);
        queueUseLinkedList.push(5);
        queueUseLinkedList.push(2);
        queueUseLinkedList.push(3);
        queueUseLinkedList.push(4);
        queueUseLinkedList.push(1);

        System.out.println(queueUseLinkedList.isFull());

        System.out.println(queueUseLinkedList.pop());
        System.out.println(queueUseLinkedList.pop());
    }
}
