package belajar.java.dasar;

public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 8;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignments
        int c = 100;
        System.out.println(c);
        c += 10;
        System.out.println(c);

        // Unary Operators
        c++;
        System.out.println(c);
    }
}
