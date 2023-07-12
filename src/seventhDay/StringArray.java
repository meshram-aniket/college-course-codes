package seventhDay;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
//        String[] str = {"a", "b", "c", "d", "e"};
        char[] str = {'a','b','c','d','e'};
        Rotate(str);

    }

    public static void Rotate(char[] str) {
       int i = 0;
        char temp = str[str.length - 1 - i];


        for (int j = str.length-1; j >= 1 ; j--) {
            swap(str, j, j-1);
        }

        str[0] = temp;
        System.out.println(Arrays.toString(str));

    }

    public static void swap(char[] arr, int last, int first) {
        char temp = arr[first];
        arr[first] = arr[last];
        arr[last]  = temp;
    }
}
