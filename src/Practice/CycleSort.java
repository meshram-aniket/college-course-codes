package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleSort {
    public static void main(String[] args) {
        int[] array = {1,0,4,4,3,3,2};
        cycleSort(array);
    }

    public static void cycleSort (int[] array) {
        int i = 0;
        while(i < array.length) {
            int correct = array[i];
            if (array[i] < array.length && array[i] != array[correct]) {
               swap(array, i, correct);
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(array));

//        to check missing number
        ArrayList<Integer> list = new ArrayList<>();
//
        for (int j = 0; j < array.length; j++) {
            if (array[j] != j) {
                list.add(j);
            }
        }
        System.out.println(list);



        // duplicate number
        ArrayList<Integer> list1 = new ArrayList<>();
        int j = 0;
        while (j < array.length) {
            if (list1.contains(array[j])) {
                System.out.print(array[j] + " ");
            }
            list1.add(array[j]);
            j++;
        }

    }


    public static void swap(int[] array, int index, int correctInd) {
        int temp = array[index];
        array[index] = array[correctInd];
        array[correctInd] = temp;
    }
}
