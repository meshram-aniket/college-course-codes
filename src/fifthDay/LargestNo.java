package fifthDay;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        while(n != 0) { //12345
            int curr = n % 10;
            if (max < curr) {
                max = curr;
            }


            else {
                n /= 10;
            }
        }
        System.out.println("largest number is: "+ max);
    }
}
