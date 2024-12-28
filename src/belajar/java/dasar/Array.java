package belajar.java.dasar;

public class Array {
  public static void main(String[] args) {

    String[] stringArray1;
    stringArray1 = new String[3];

    stringArray1[0] = "Dyaz";
    stringArray1[1] = "Amrullah";
    stringArray1[2] = "Ganteng";

    System.out.println(stringArray1[0]);
    System.out.println(stringArray1[1]);
    System.out.println(stringArray1[2]);

    stringArray1[2] = "Keren";
    System.out.println(stringArray1[2]);

    // Another way to create array
    String[] stringArray2 = new String[3];

    String[] namaNama = {
            "Dyaz", "Amrullah"
    };

    namaNama[0] = null;

    int[] arrayInt = new int[]{
            1,2,3,4,5,6,7,8,9,10
    };

    long[] arrayLong = {
            10L, 20L, 30L
    };

    arrayLong[0] = 0;
    System.out.println(arrayLong.length); // 3

    // Array in array
    String[][] members = {
            {"Dyaz", "Amrullah"},
            {"Sinta", "Stiawati"},
            {"Tristan", "Bierhoff", "Kusuma"}
    };

    System.out.println(members[0][1]); // Amrullah
    System.out.println(members[1][0]); // Sinta
    System.out.println(members[2][2]); // Kusuma

  }
}

