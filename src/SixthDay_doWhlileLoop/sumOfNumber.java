package SixthDay_doWhlileLoop;

public class sumOfNumber {
    public static void main(String[] args) {
        int n = 0;  //   1234
        int sum = 0;
        do {
            sum += 1;
            n /= 10;
        }
        while(n != 0);

        System.out.println(sum);


        one: for (int i = 1; i <= 5; i++) {
            two:
            for (int j = i; j <= 5 ; j++) {
                if (j == i) {
                    break one;
                }
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
