package belajar.java.dasar;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Dyaz", "Amrulah");
    }

    private static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " "+ lastName);
    }
}
