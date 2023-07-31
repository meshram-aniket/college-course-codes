package Pract;

import javax.swing.*;

public class prac {
    static class Node {
        Node[] children;
        boolean eow;
        Node() {
            children = new Node[26];
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



    public static boolean search(String key) {
        Node curr = root;

        for (int i = 0; i < key.length(); i++) {
            int ind = key.charAt(i) - 'a';

            if (curr.children[ind] == null) {
                return false;
            }

            if (i == key.length() - 1 && curr.children[ind].eow == false) {
                return false;
            }

            curr = curr.children[ind];
        }
        return true;
    }


    public static boolean delete(String key) {
        Node curr = root;

        for (int i = 0; i < key.length(); i++) {
            int ind = key.charAt(i) - 'a';

            if (curr.children[ind] == null) {
                return false;
            }

            if (i == key.length() - 1 && curr.children[ind].eow == true) {
                curr.children[ind].eow = false;
            }
            curr = curr.children[ind];
        }
        return true;

    }



    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            String first = key.substring(0, i);
            String second = key.substring(i);
            if (search(first) && wordBreak(second)) {
                return true;
            }

        }
        return false;
    }


    public static int countNode (Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }
        return count + 1;
    }





    public static boolean startWith(String key) {
        Node curr = root;

        for (int i = 0; i < key.length(); i++) {
            int ind = key.charAt(i) - 'a';

            if (curr.children[ind] == null) {
                return false;
            }

            curr = curr.children[ind];

        }
        return true;
    }


    public static void main(String[] args) {
        String[] words = {"banana", "apple", "orange", "watermelen"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("banana"));
        System.out.println("delete the item: " + delete("orange"));
        System.out.println("found the element: " + search("orange"));
//        System.out.println(startWith("man"));
//
//        String ans = "aniket";
//        for (int i = 0; i < ans.length(); i++) {
//            insert(ans.substring(i));
//        }
//
//        System.out.println(countNode(root));

//        String[] words = {"i", "like", "samsung", "sung", "ilik"};
//        for (int i = 0; i < words.length; i++) {
//            insert(words[i]);
//        }
//
//        String key = "ilikesamsung";
//        System.out.println(wordBreak(key));
//
//        String ans = "aniket";
//        for (int i = 1; i <= ans.length(); i++) {
//            System.out.println(ans.substring(0, i));
//            System.out.println(ans.substring(i));
//        }
    }
}
