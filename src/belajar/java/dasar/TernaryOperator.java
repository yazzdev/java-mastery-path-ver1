package belajar.java.dasar;

public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 70;

        // template -> = condition ? output if true : output if false;
        String ucapan = nilai > 70 ? "Lulus" : "Coba Lagi";

        System.out.println(ucapan);
    }
}
