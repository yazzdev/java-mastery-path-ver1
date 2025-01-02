package belajar.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();

    collection.add("Dyaz");
    collection.add("Amrullah");
    collection.addAll(List.of("Sedang", "Belajar", "Java", "Amrullah"));

    for (var value:
         collection) {
      System.out.println(value);
    }

    System.out.println(collection.size());

    System.out.println("----- REMOVE -----");

    collection.remove("Amrullah");
    collection.removeAll(List.of("Sedang", "Java"));

    for (var value:
            collection) {
      System.out.println(value);
    }

    System.out.println(
            collection.contains("Dyaz")
    );

    System.out.println(
            collection.containsAll(List.of("Dyaz", "Java"))
    );

    System.out.println(collection.size());
  }
}
