package Practice;

import java.util.*;
import java.util.Arrays;
import java.util.Collection;
public class Arra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("enter an array: ");
//        int[] b = new int[5];
//        for (int i = 0; i <= b.length-1 ; i++) {
//            b[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(b));
//
//
//        System.out.println("enter an array: ");
//        int[][] a = new int[3][3];
//        for (int i = 0; i <= a.length-1; i++) {
//            for (int j = 0; j <= a[i].length-1 ; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(a));
//
//        for (int[] c: a) {
//            System.out.println(Arrays.toString(c));
//        }
//


//        ArrayList<Integer> arr = new ArrayList<>();
//
//        arr.add(10);
//        arr.add(1);
//        arr.add(2);
//        Collections.sort(arr);
//        System.out.println(arr);
//        System.out.println(arr.contains(10));
//        System.out.println(arr.size());
//        arr.set(0, 1000);
//        System.out.println(arr);
//        arr.remove(1);
//        System.out.println(arr);
//
//
//        System.out.println("enter arrays: ");
//        ArrayList<Integer> arr1 = new ArrayList<>(5);
//        for (int i = 0; i < 5; i++) {
//            arr1.add(sc.nextInt());
//        }
//
//
//        System.out.println(arr1);


//        Multidimension Array

//        System.out.println("enter array: ");
//        ArrayList<ArrayList<Integer>> arr3 = new ArrayList<>(5);
//        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(1);
//        a1.add(2);
//        arr3.add(a1);
//
//        ArrayList<Integer> a2 = new ArrayList<>();
//        a2.add(3);
//        a2.add(4);
//        arr3.add(a2);
//
//        System.out.println(arr3);


//        System.out.println("enter an array: ");
//        ArrayList<ArrayList<Integer>> arr4 = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            arr4.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr4.get(i).add(sc.nextInt());
//            }
//        }
//
//        System.out.println(arr4);


//        System.out.println("enter target: ");
//        int target = sc.nextInt();
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(BS(array, target));
//    }




//        public static int BS (int[] array, int target){
//            int start = 0;
//            int end = array.length-1;
//
//            boolean isAscending;
//            if (array[start] < array[end]) {
//                isAscending = true;
//            }
//            else {
//                isAscending = false;
//            }
//         // 1 2 3 4 5 6 7 8 9
//            while (start <= end) {
//                int mid = (end + start)/2;
//
//                if (isAscending) {
//                    if (target < array[mid]) {
//                        end = mid -1;
//                    }
//                    else if (target > array[mid]) {
//                        start = mid + 1;
//                    }
//                    else {
//                        return array[mid+1];
//                    }
//                }
//
//                else  {
//                    if (target < array[mid]) {
//                        start = mid + 1;
//                    }
//                    else if (target > array[mid]) {
//                        end = mid - 1;
//                    }
//                    else {
//                        return array[mid-1];
//                    }
//                }
//            }
//
//            return -1;
    }
}

