package Practice;

public class practice{
    public static void main(String[] args) {
        practice list = new practice();
        list.insertFirst(23);
        list.insertFirst(3);
        list.insertFirst(6);
        list.display();
        list.insertLast(32);
        list.display();
        list.insert(34, 2);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
    }

    private Node head;
    private Node tail;
    private int size;
    public practice() {
        this.size = 0;
    }

    class Node {
        int value;
        Node next;

        public Node (int value) {
            this.value = value;
        }

        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;

        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert (int value, int index) {
        if (index == 0) {
            insertFirst(value);
        }

        if (index == size) {
            insertLast(value);
        }

        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }


    public void deleteFirst() {
        Node temp = head;
        head = temp.next;
        size--;

        if (head == null) {
            tail = head;
        }
    }

    public void deleteLast() {
        if (size <= 0) {
            deleteFirst();
        }

        Node node = getIndex(size - 2);
        node.next = tail;
        tail.next = null;
        size--;
    }


    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
        }

        if (index == size) {
            deleteLast();
        }

        Node node = getIndex(index - 1);
        node.next = node.next.next;
        size--;
    }


    public Node getIndex(int index) {
       Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public void display () {
        Node node = head;
        for (int i = 0; i < size; i++) {
            System.out.print(node.value+" -> ");
            node = node.next;
        }
        System.out.println("end");
    }
}
