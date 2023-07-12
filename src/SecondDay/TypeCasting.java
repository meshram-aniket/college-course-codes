package SecondDay;

public class TypeCasting {
    public static void main(String[] args) {
        byte a = (byte)250;
        byte b = (byte)250;

        int m = (int)235.23;
        float n = (int)343.45;

        byte p = (byte)254.33;
        byte q = (byte)250.53;

        char g = (char)4;
        char h = (char)5;

        double x = (float)34;

        System.out.println(a+b);
        System.out.println(m+n);
        System.out.println(p-q);
        System.out.println((g+h)+'a');
        System.out.println(n);
        System.out.println(a+h);
        System.out.println(h+g);
        System.out.println(x);
    }
}
