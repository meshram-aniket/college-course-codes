package EightDay;

import java.util.Arrays;

public class printDiagonal {
    public static void main(String[] args) {

        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,1,2,3},
                {4,5,6,7}
        };
        System.out.println();
//        isDiagonal(array);


    }


//    public static void display(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (isTrue(array, i, j)) {
//                    System.out.print(array[i][j]+" ");
//                }
//                else {
//                    System.out.print("_ ");
//                }
//            }
//            System.out.println();
//        }
//    }
//
//
//    public static boolean isTrue(int[][] array, int row, int col) {
//        if (row == col || col == array.length - 1 - row) {
//            return true;
//        }
//        return false;
//    }
////
//    public static void isDiagonal(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (j == i || j == array.length - 1 - i) {
//                    System.out.print(array[i][j]+" ");
//                }
//                else {
//                    System.out.print("_ ");
//                }
//            }
//            System.out.println();
//        }
//
//    }
}
