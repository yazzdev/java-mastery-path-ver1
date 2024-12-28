package belajar.java.dasar;

public class Break {

    public static void main(String[] args) {
        var counter = 1;

        while(true) {
            System.out.println("Perilangan ke-" + counter);
            counter++;

            if(counter > 10){
                break;
            }
        }
        System.out.println("Perulangan berhenti!");
    }
}
