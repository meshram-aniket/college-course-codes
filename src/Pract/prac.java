package Pract;

import java.util.LinkedList;

public class prac {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(4);
        list.add(1,5);

//
        insertFirst(3);
        insertFirst(4);
        insertLast(6);
//        display();
//        System.out.println(deleteFirst());
//        display();
//        System.out.println(deleteLast());
//        display();
        reverse();
    }

    private static Node head;
    private static Node tail;

    private static int size;
    prac() {
        this.size = 0;
    }


    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

        Node (int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


    public static void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;
        node.prev = null;
    }


    public static void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node last = getIndex();
        last.next = node;
        node.prev = last;
        node.next = null;
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


        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
//        Node node = new Node(element, temp.next);
        Node SecondLast = getIndex(index);
//        SecondLast.next = node;
    }


    public static int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            return -1;

        }
        head.prev = null;
        return val;
    }


    public static int deleteLast() {

        if (head == null) {
            deleteFirst();
            return -1;
        }
        Node last = getIndex();
        Node secondLast = last.prev;
        secondLast.next = null;


        return last.val;
    }


    public static Node getIndex(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public static Node getIndex() {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }


    public static Node getLastIndex() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }


    public static void reverse() {
        Node temp = head;
        Node intit = null;
        while(temp != null) {
            intit = temp;
            temp = temp.next;
        }


        while(intit != null) {
            System.out.print(intit.val + " -> ");
            intit = intit.prev;
        }
        System.out.println("start");
    }
}
