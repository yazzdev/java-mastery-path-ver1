package belajar.java.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
  public static void main(String[] args) {

    // Set for data Unique

    // HashSet tidak berurutan
    System.out.println("-----HashSet----");
    Set<String> names = new HashSet<>();

    names.add("Dyaz");
    names.add("Amrullah");
    names.add("Java");
    names.add("Dyaz");
    names.add("Amrullah");
    names.add("Java");

    for (var name:
         names) {
      System.out.println(name);
    }

    // LinkedHashSet berurutan
    System.out.println("-----LinkedHashSet----");
    Set<String> names1 = new LinkedHashSet<>();

    names1.add("Dyaz");
    names1.add("Amrullah");
    names1.add("Java");
    names1.add("Dyaz");
    names1.add("Amrullah");
    names1.add("Java");

    for (var name:
            names1) {
      System.out.println(name);
    }


  }
}
