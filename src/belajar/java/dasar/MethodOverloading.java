package belajar.java.dasar;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Dyaz");
        sayhello("Dyaz", "Amrullah");
    }

    private static void sayHello() {
        System.out.println("Hello");
    }

    private static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    private static void sayhello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
