package tenthday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        StringName s = new StringName();
//        s.CharAt();


//        public static void CharAt () {
        // to find char

        String firstName = "AniketMeshram";

        for (int i = 0; i < firstName.length(); i++) {
            System.out.print(firstName.charAt(i) + " ");
        }

        System.out.println();


        // count the number of vowels
        int sum = 0;
        for (int i = 0; i < firstName.length(); i++) {
            if (firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || firstName.charAt(i) == 'i' || firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
                sum += 1;
            }
        }
        System.out.println(sum);


        // count the repeating words
        int count = 0;
        ArrayList<Character> list = new ArrayList<>();
//        char[] up = new char[firstName.length()];
        for (int i = 0; i < firstName.length(); i++) {
            if (list.contains(firstName.charAt(i))) {
                count++;
            }
            list.add(firstName.charAt(i));
        }
        System.out.println(list);
        System.out.println(count);



        char[] ch = {'a','b','c','c','b','c'};
        System.out.println(isPalindrome(ch));

        String rev = "Aniket";
        reverse(rev);
    }

    // palindrome
    public static boolean isPalindrome(char[] ch) {
        int start = 0;
        int end = ch.length - 1;
        while (start <= end) {
            if (ch[start] == ch[end]) {
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;



        
    }



    public static void reverse(String str) {
        String empty = "";
        for (int i = str.length() - 1; i > 0; i--) {
            empty = empty + str.charAt(i);
        }
        System.out.println("reversre string: " +empty);
    }


    public static void concate() {
        String s1 = "good";
        String s2 = "Morning";
//        s1.concat(s2);
        String s3 = s1.concat(s2);
        System.out.println(s3);

    }
}
