package practice.stack_use_linkedlist;

public class StackUseLinkedListTest {
    public static void main(String[] args) {
        StackUseLinkedList stackUseLinkedList = new StackUseLinkedList(5);
        stackUseLinkedList.push(5);
        stackUseLinkedList.push(2);
        stackUseLinkedList.push(3);
        stackUseLinkedList.push(4);
        stackUseLinkedList.push(1);
        System.out.println(stackUseLinkedList.isFull());

        System.out.println(stackUseLinkedList.pop());
        System.out.println(stackUseLinkedList.pop());
        System.out.println(stackUseLinkedList.pop());
    }
}
