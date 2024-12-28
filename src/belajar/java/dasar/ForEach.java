package belajar.java.dasar;

public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Dyaz", "Amrullah", "Sedang",
                "Belajar", "Java", "Dengan",
                "Pak", "Eko", "Kurniawan", "Khannedy",
                "di", "Programmer", "Zaman", "Now"
        };

        // Menggunakan metode jadul
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println();
        System.out.println("Menggunakan For Each");

        for (var name: names) {
            System.out.println(name);
        }
    }
}
