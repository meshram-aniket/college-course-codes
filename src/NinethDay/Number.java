package NinethDay;

public class Number {
    public static void main(String[] args) {
        Number n1 = new Number();
        n1.display(4,3);
//        Number n2 = new Number();

        Number n3 = new Number();
        n3.setX(3);
        Number n4 = new Number();
        n4.setNum2(5);
        System.out.println(n3.getX() + n4.getNum2());
    }

    int n;
    int m;


    public void display(int n, int m) {
        this.n = n;
        this.m = m;
        System.out.println(m + n);
    }

    private int x;
    private int num2;

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }


    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }


}
