package ThirdDay;

import java.util.Scanner;

public class BitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        System.out.println("enter a bit: ");
        int bit = sc.nextInt();
//        int count = 0;
//        int rev = 0;
//        while(num != 0) {
//        int remainder = num % 2;
//            if (remainder == 0) {
//                count =  ((count * 10)+remainder);
//                num = num / 2;
//            }
//            else {
//                count = (count + (remainder*10))*10;
//                num = num / 2;
//            }
//        }

//        while (count != 0) {
//            int remainder = count % 10;
//            rev = (rev*10) + remainder;
//            count = count / 10;
//        }
//        System.out.println(count);

        System.out.println(num>>(bit-1) & 1);

    }
}
