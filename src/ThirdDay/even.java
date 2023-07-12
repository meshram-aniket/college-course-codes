package ThirdDay;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
