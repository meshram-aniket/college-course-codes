package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
       boolean[][] array = {
               {false, false, false, false},
               {false, false, false, false},
               {false, false, false, false},
               {false, false, false, false}
       };

       Transpose(array, 0);
    }

    public static void Transpose(boolean[][] array, int row) {
//        if (row == array.length - 1) {
//            display(array);
//        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (istrue(array, i, j)) {
                    array[i][j] = true;
                }
                else {
                    array[i][j] = false;
                }
            }
            row++;
        }

        for (boolean[] b: array){
            System.out.println(Arrays.toString(b));
        }
    }

    public static boolean istrue(boolean[][] array, int row, int col) {
        if ( row == col || col == array.length - 1 - row) {
            return true;
        }
        return false;
    }

////

}
