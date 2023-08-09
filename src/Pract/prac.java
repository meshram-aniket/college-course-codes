package Pract;

import java.util.LinkedList;

public class prac {
    public static void main(String[] args) {
        insertFirst(5);
        display();
    }

    private static Node head;
    private static Node tail;
    static int size;
    prac() {
        this.size = 0;
    }


    public static class Node {
        int val;
        Node next;


        Node(int val) {
            this.val = val;
        }
        Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
        }
        node.next = head;
        head = node;
        tail.next = node;

    }

    public static void display() {
        Node temp = head;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        while(temp != head);
    }
}
