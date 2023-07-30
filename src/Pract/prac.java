package Pract;

import javax.swing.*;

public class prac {
    static class Node {
        Node[] children;
        boolean eow;
        Node()  {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }


    static Node root = new Node();
    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a';

            if (curr.children[ind] == null) {
                curr.children[ind] = new Node();
            }


            if (i == word.length() - 1) {
                curr.children[ind].eow = true;
            }

            curr = curr.children[ind];
        }
    }


    public static boolean searching(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a';

            if (curr.children[ind] == null) {
                return false;
            }


            if (i == word.length() - 1 && curr.children[ind].eow == false) {
                return false;
            }

            curr = curr.children[ind];
        }
        return true;
    }



    public static boolean startWith(String prefix) {
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            int ind = prefix.charAt(i) - 'a';

            if (curr.children[ind] == null) {
                return false;
            }
            curr = curr.children[ind];
        }
        return true;
    }


    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += count(root.children[i]);
            }
        }
        return count + 1;
    }



    public static void main(String[] args) {
//        String[] words = {"the", "their", "there", "a", "any"};
//        for (int i = 0; i < words.length; i++) {
//            insert(words[i]);
//        }
//
//        System.out.println(searching("ther"));


        String[] words = {"apple", "app", "women", "man", "mango"};

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(startWith("apple"));

//        String str = "apple";
//        for (int i = 0; i < str.length(); i++) {
//            insert(str.substring(i));
//        }
//
//        System.out.println(count(root));
    }



}
