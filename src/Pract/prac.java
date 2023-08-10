package Pract;

import java.util.LinkedList;

public class prac {
    public static void main(String[] args) {

        //        insertFirst(5);
//        insertLast(7);
//        insertLast(6);
//        insert(1, 10);
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


    public static void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        node.next = head;
    }


    public static void insert(int index, int element) {

        if (index == 0) {
            insertFirst(element);
            return;
        }

        if (index == size) {
            insertLast(element);
            return;
        }
        Node secondLastOfIndex = getIndex(index);
        Node node = new Node(element, secondLastOfIndex.next);
        secondLastOfIndex.next = node;
        node.next = secondLastOfIndex.next.next;

    }


    public static Node getIndex(int index) {
        Node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static void display() {
        Node temp = head;

        if (head == null) {
            
        }
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        while(temp != head);
        System.out.println("end");
    }
}
