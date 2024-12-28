package belajar.java.dasar;

public class KonversiNumber {
    public static void main(String[] args) {
        // Widening Casting (Automated) : byte -> short -> int -> long -> float -> double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // Narrowing Casting (Manual) : double -> float -> long -> int -> short -> byte
        // Warning : number overflow
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;
    }
}
