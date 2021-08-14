package exercise.reverse_use_stack;
import practice.stack_use_linkedlist.StackUseLinkedList;

import java.util.Scanner;

public class ReverseArrayInterger {
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        StackUseLinkedList stackUseLinkedList = new StackUseLinkedList(size);
        int []arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.floor(Math.random()*10 + 2);
        }

        System.out.println("Array before being reversed");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < size; i++) {
            stackUseLinkedList.push(arr[i]);
        }

        for (int i = 0; i <size; i++) {
            arr[i] = stackUseLinkedList.pop();
        }

        System.out.println("Array after being reversed");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
