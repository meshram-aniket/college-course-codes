package fifthDay;

import java.util.Scanner;

//x    y
//125 - 175
//50 - 125
//50 - 75
//50 - 25
//25 - 25
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x : ");
        int x = sc.nextInt();
        System.out.println("enter x : ");
        int y = sc.nextInt();

        while (x != y) {
            if (x > y){
               x = x - y;
            }
            else{
                y = y - x;
            }
        }
        System.out.println("GCD is: "+ x);
    }
}
