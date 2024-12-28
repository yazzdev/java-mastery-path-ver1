package belajar.java.oop.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
  public static void main(String[] args) {

    // Manual
    System.out.println("======= Manual close reader!! =======");
    BufferedReader reader = null;

    try {
      reader = new BufferedReader(
              new FileReader("README.md")
      );

      while (true) {
        String line = reader.readLine();
        if (line == null) {
          break;
        }
        System.out.println(line);
      }
    } catch (Throwable throwable) {
      System.out.println("Error membaca file : " + throwable.getMessage());
    } finally {
      if (reader != null) {
        try {
          reader.close();
          System.out.println("Sukses Menutup!!");
        } catch (IOException ioException) {
          System.out.println("Error menutup resource : " + ioException.getMessage());
        }
      }
    }

    // Try With Resource
    System.out.println();
    System.out.println("======= Try With Resource =======");
    try (BufferedReader reader2 = new BufferedReader(new FileReader("README.md"))) {
      while (true) {
        String line = reader2.readLine();
        if (line == null) {
          break;
        }
        System.out.println(line);
      }
    } catch (Throwable throwable) {
      System.out.println("Error membaca file : " + throwable.getMessage());
    }
  }
}
