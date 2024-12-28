package belajar.java.dasar;

public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(20, 30);
        System.out.println(result);

        System.out.println(sum(10, 70));

        // Kalkulator
        System.out.println(calculator(20, "+", 10));
        System.out.println(calculator(20, "-", 10));
        System.out.println(calculator(20, "*", 10));
        System.out.println(calculator(20, "/", 10));
        System.out.println(calculator(10, "salah", 10));
    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    static int calculator(int value1, String operasi, int value2) {
        switch (operasi){
            case "+" :
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            default:
                return 0;
        }
    }
}
