package optional.demo_hashmap_linkedmap_hashset;

import java.util.Collections;
import java.util.LinkedList;

public class HashSet {
    private Node head;
    private int numNodes;

    public HashSet(Object data) {
        head = new Node(data);
    }

    public HashSet() {
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public Node get(int index) {
        if (head == null)
            return null;
        else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addLast(Object data) {
        if (head == null)
            head = new Node(data);
        else {
            Node temp = head;
            Node lastAdd;
            while (true) {
                if (temp.next == null)
                    break;
                if (temp.getData() == data)
                    break;
                temp = temp.next;
            }

            if (temp.getData() != data){
                lastAdd = temp.next;
                temp.next = new Node(data);
                temp.next.next = lastAdd;
                numNodes++;
            }
        }
    }

    public void remove(Object data) {
        if (head == null)
            System.out.println("List null");
        else {
            Node temp = head;
            Node lastAdd;
            while (true) {
                if (temp.next == null)
                    break;

                if (temp.next.getData() == data)
                    break;

                temp = temp.next;
            }

            lastAdd = temp.next.next;
            temp.next = lastAdd;
            numNodes--;
        }
    }

    public boolean remove1(Object data) {
        if (head == null)
            return false;
        else {
            Node temp = head;
            Node lastAdd;
            while (true) {
                if (temp.next == null)
                    break;

                if (temp.next.getData() == data)
                    break;

                temp = temp.next;
            }

            if (temp.next != null){
                lastAdd = temp.next.next;
                temp.next = lastAdd;
                numNodes--;
                return true;
            }
            return false;
        }
    }

    public int getNumNodes() {
        return numNodes;
    }

    public int size() {
        return this.numNodes + 1;
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (temp.getData() == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object data) {
        int index = -1;
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (temp.getData() == data)
                return i;
            temp = temp.next;
        }
        return index;
    }

    public void clear() {
        this.head = null;
        numNodes = -1;
    }

    public Node getLast() {
        return this.get(this.size() - 1);
    }

    public Node getFirst() {
        return head;
    }

    public HashSet clone() {
        HashSet clone = new HashSet();
        Node temp = this.head;
        for (int i = 0; temp != null; i++) {
            clone.addLast(temp.getData());
            temp = temp.next;
        }
        return clone;
    }

    public void sort(){
        Node temp = head;
        Node temp1 = head;

        LinkedList list = new LinkedList();

        for (int i = 0; temp != null; i++) {
            list.add(temp.getData());
            temp = temp.next;
        }

        Collections.sort(list);
        this.clear();

        for (int i = 0; i < list.size(); i++) {
            this.addLast(list.get(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        HashSet ll = new HashSet();

        ll.addLast("b");
        ll.addLast("a");
        ll.addLast("d");
        ll.addLast("c");
        ll.addLast("a");
        ll.addLast("f");

        ll.remove1("f");
        ll.printList();
        HashSet ll1 = ll.clone();
        System.out.println("Size: " + ll.size());
        ll.sort();
        ll.printList();
        System.out.println("HashSet2: ");
        ll1.printList();
    }
}