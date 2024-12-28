package belajar.java.dasar;

public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Dyaz Amrullah";

        System.out.println(name);

        int age = 22;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Dyaz Update Name";
        System.out.println(name);

        // name = 100; Invalid data type

        var firstName = "Dyaz";
        var lastName = "Amrullah";

        // Illegal expression
        // var company;
        // company = "Google";

        // Constant belajar.java.dasar.Variable
        final String application = "Belajar Java";

        // application = "Belajar Node.js"  -> not working

    }
}
