package belajar.java.dasar;

public class MethodVariableArgument {
    public static void main(String[] args) {

        // Cara Lama
        int[] values = {
                40, 50, 60, 80
        };

        sayCongrats("Asep", values);

        // Variabel Arguments
        sayCongrats2("Dyaz", 80,80,80,90);
    }

    // Cara Lama
    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat "+ name+ " Anda Telah Lulus!!");
        } else {
            System.out.println("Mohon Maaf "+ name+ " Anda Tidak Lulus Lulus!!");
        }
    }

    // Variabel Argumnet
    static void sayCongrats2(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat "+ name+ " Anda Telah Lulus!!");
        } else {
            System.out.println("Mohon Maaf "+ name+ " Anda Tidak Lulus Lulus!!");
        }
    }
}
