package belajar.java.dasar;

public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik!!");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik!");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus!");
                break;
            default:
                System.out.println("Sepertinya Anda Salah Jurusan");
        }

        // Switch Lambda (V.14 ke atas)
        switch (nilai){
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik!!");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik!");
            case "D" -> System.out.println("Anda Tidak Lulus!");
            default -> {
                System.out.println("Sepertinya Anda Salah Jurusan");
            }
        }

        // Switch yield (V.14 ke atas)
        String ucapan;
        ucapan = switch (nilai) {
            case "A":
                yield "Wow, Anda Lulus Dengan Baik!!";
            case "B", "C":
                yield "Nilai Anda Cukup Baik!";
            case "D":
                yield "Anda Tidak Lulus!";
            default:
                yield "Sepertinya Anda Salah Jurusan";
        };

        System.out.println(ucapan);
    }
}
