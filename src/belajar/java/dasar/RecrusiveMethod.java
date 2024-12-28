package belajar.java.dasar;

public class RecrusiveMethod {
    public static void main(String[] args) {
        System.out.println(1 * 2 * 3); // Validasi
        System.out.println(factorialLoop(3));

        System.out.println(factorialRecrusive(3));
    }

    static int factorialLoop(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }

    static int factorialRecrusive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecrusive(value - 1);
        }
    }
}
