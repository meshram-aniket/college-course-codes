package seventhDay.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ElementTogether {
    public static void main(String[] args) {
        int[] array = {45, 10, 20, 30, 11};
        System.out.println(Arrays.toString(array));
        int average = average(array);
        System.out.println("the average is: " +average);
        System.out.println();
        findGreaterOrSmaller(array, average);
    }

    // to find average
    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;
        return avg;
    }

    // to find greater or smaller than average
    public static void findGreaterOrSmaller(int[] array, int avg) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int i = 0;
        while (i < array.length) {
            if (array[i] < avg) {
                list1.add(array[i]);
//                System.out.print(array[i] + ", ");
            }
            else {
                list2.add(array[i]);
//                System.out.println(array[i]+", ");
            }
            i++;
        }
        System.out.println("Element smaller than average is: " +list1);
        System.out.println("Element greater than average is: " +list2);
        System.out.println();

    }
}
