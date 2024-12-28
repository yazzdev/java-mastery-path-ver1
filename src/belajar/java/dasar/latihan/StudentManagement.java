package belajar.java.dasar.latihan;

import java.util.Scanner;

public class StudentManagement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Tipe Data dan Variabel
    System.out.print("Masukkan jumlah siswa: ");
    int totalStudents = scanner.nextInt();
    scanner.nextLine(); // Membersihkan newline

    String[] studentNames = new String[totalStudents];
    int[] studentScores = new int[totalStudents];
    char[] studentGrades = new char[totalStudents];

    // Input Data Siswa
    for (int i = 0; i < totalStudents; i++) {
      System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
      studentNames[i] = scanner.nextLine();

      System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
      studentScores[i] = scanner.nextInt();
      scanner.nextLine(); // Membersihkan newline

      // Menentukan grade siswa (if statement dan ternary operator)
      studentGrades[i] = (studentScores[i] >= 90) ? 'A' :
              (studentScores[i] >= 80) ? 'B' :
                      (studentScores[i] >= 70) ? 'C' :
                              (studentScores[i] >= 60) ? 'D' : 'E';
    }

    // Operasi Matematika, Perbandingan, dan Boolean
    int sum = 0, highestScore = 0, lowestScore = 100;
    String topStudent = "", bottomStudent = "";

    for (int i = 0; i < totalStudents; i++) {
      sum += studentScores[i];

      if (studentScores[i] > highestScore) {
        highestScore = studentScores[i];
        topStudent = studentNames[i];
      }

      if (studentScores[i] < lowestScore) {
        lowestScore = studentScores[i];
        bottomStudent = studentNames[i];
      }
    }

    // Menghitung rata-rata nilai
    double averageScore = (double) sum / totalStudents;

    // Menampilkan Data Siswa
    System.out.println("\n=== Data Siswa ===");
    for (int i = 0; i < totalStudents; i++) {
      System.out.println("Nama: " + studentNames[i] + ", Nilai: " + studentScores[i] + ", Grade: " + studentGrades[i]);
    }

    // Menampilkan Hasil Analisis
    System.out.println("\n=== Analisis ===");
    System.out.println("Rata-rata nilai: " + averageScore);
    System.out.println("Nilai tertinggi: " + highestScore + " oleh " + topStudent);
    System.out.println("Nilai terendah: " + lowestScore + " oleh " + bottomStudent);

    // Contoh penggunaan method
    displayMessage("Program selesai dijalankan. Terima kasih!");
  }

  // belajar.java.dasar.Method dengan Parameter dan Return Value
  public static void displayMessage(String message) {
    System.out.println(message);
  }
}

