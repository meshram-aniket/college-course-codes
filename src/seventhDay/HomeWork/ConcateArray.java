package seventhDay.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcateArray {
    public static void main(String[] args) {
        int[] array1 = {10,20,30};
        int[] array2 = {1,2,3,4};

        // 1st way
        int[] ans = new int[array2.length + array1.length];
        System.arraycopy(array1, 0, ans, 0, array1.length);
        System.arraycopy(array2, 0, ans, array1.length, array2.length);
        System.out.println(Arrays.toString(ans));


        // 2nd way
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array1.length ; i++) {
            list.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            list.add(array2[i]);
        }
        System.out.println(list);
    }
}
