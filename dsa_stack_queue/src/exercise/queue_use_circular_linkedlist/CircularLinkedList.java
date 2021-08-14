package exercise.queue_use_circular_linkedlist;

public class CircularLinkedList {
    private Node head = null;
    private Node last = null;
    private int numNodes = 0;

    public CircularLinkedList(Object data) {
        head = new Node(data);
    }

    public CircularLinkedList() {
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

    public void addFirst(Object data) {
        Node newNode = new Node(data);

        if (head == null) {
            last = newNode;
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        numNodes++;
    }

    public boolean removeFirst() {

        if (head == null) {
            return false;
        } else if(head == last){
            head = null;
            last = null;
            return true;
        }
        else{
                Node node = head.next;
                head = node;
                last.next = head;
        }
        numNodes--;
        return true;
    }

    public boolean removeLast() {

        if (head == null) {
            return false;
        } else if(head == last){
            head = null;
            last = null;
            return true;
        }
        else{
            Node temp = head;
            while (true){
                if (temp.next ==last)
                    break;
            }
        }
        numNodes--;
        return true;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);

        if (head == null){
            last = newNode;
            head = newNode;
        }else {
            last.next = newNode;
            last = newNode;
            last.next = head;
        }

        numNodes++;
    }

    public void remove(int index) {


//        if (head == null){
//            last = newNode;
//            head = newNode;
//        }else {
//            last.next = newNode;
//            last = newNode;
//            last.next = head;
//        }
//        numNodes++;
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

    public void add(int index, Object data) {
        Node newNode = new Node(data);
        if (head == null){
            last = newNode;
            head = newNode;
            numNodes++;
        }
        else {
            Node temp = head;
            Node holder;

            for (int i = 0; i < index ; i++) {
                temp = temp.next;
            }

            if (temp !=last)
            {
                holder = temp.next;
                temp.next = newNode;
                temp.next.next = holder;
                numNodes++;
            }

            if (temp ==last)
                addLast(data);
        }
    }

    public void printList() {
        Node temp = head;
        while (true) {
            System.out.println(temp.data);
            temp = temp.next;
            if (temp  == last){
                System.out.println(temp.data);
                break;
            }
        }
    }

    public int getNumNodes(){
        return numNodes;
    }

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(2,12);
        circularLinkedList.addLast(1);
        circularLinkedList.addLast(4);
        circularLinkedList.addFirst(3);
        circularLinkedList.addFirst(5);
        circularLinkedList.add(4,9);
        circularLinkedList.removeFirst();
        circularLinkedList.removeFirst();
        circularLinkedList.printList();
        //System.out.println(circularLinkedList.getNumNodes());
    }
}
