package exercise.queue_use_circular_linkedlist;

public class QueueUseCircularLinkedList {
        private Node head;
        private Node last;
        private int numNodes;

        public QueueUseCircularLinkedList(Object data) {
            head = new Node(data);
        }

        public QueueUseCircularLinkedList() {
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

        public void add(int index, Object data) {
            Node newNode = new Node(data);

            if (head == null){
                head = newNode;
                last = newNode;
                newNode.next = head;
            }else if(index <=0 || index >=numNodes){
                System.out.println("Index out of range");
            }
            else {
                Node temp = head;

                for (int i = 0; i < index - 1 && temp.next != head; i++) {
                    temp = temp.next;
                }
                newNode = temp.next;
                temp.next = newNode;
                temp.next.next = newNode;
                numNodes++;
            }
        }

        public void addFirst(Object data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                last = newNode;
                newNode.next = head;
            }
            else {
                Node temp = head;
                head = new Node(data);
                head.next = temp;
                numNodes++;
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
            Node newNode = new Node(data);
            if (head == null)
                head = new Node(data);
            else {
                Node temp = head;
                Node lastAdd;
                last.next = newNode;
                last = newNode;
                numNodes++;
            }
        }

        public void remove(int index) {
            if (head == null)
                System.out.println("List null");
            else if (index == 0){
                head = head.next;
            }
            else{
                Node temp = head;
                for (int i = 1; i < index - 1 && temp.next != null; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                numNodes--;
            }
        }

        public boolean removeElement(Object data) {
            Node temp = head;
            for (int i = 0; temp != null; i++) {
                if (temp.getData() == data){
                    this.remove(i);
                    return true;
                }
                temp = temp.next;
            }

            return false;
        }

        public int size(){
            return this.numNodes + 1;
        }

        public void clear(){
            this.head = null;
        }

        public Node getLast() {
            return this.get(this.size() - 1);
        }

        public Node getFirst() {
            return head;
        }
}
