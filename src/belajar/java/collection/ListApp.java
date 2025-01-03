package belajar.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
  public static void main(String[] args) {
    // Array List
    System.out.println("---- Array List ----");
    List<String> stringList = new ArrayList<>();

    stringList.add("Dyaz");
    stringList.add("Amrullah");

    stringList.set(0, "Dyaz Update");

    stringList.remove(1);
    System.out.println(stringList.get(0));

    for (var value:
         stringList) {
      System.out.println(value);
    }

    // Linked List
    System.out.println("---- Linked List ----");
    List<String> stringList1 = new LinkedList<>();

    stringList1.add("Dyaz");
    stringList1.add("Amrullah");
    stringList1.addAll(2, List.of("Sedang", "Belajar", "Java"));

    for (var value:
            stringList1) {
      System.out.println(value);
    }

    stringList1.set(0, "Dyaz Update Linked List");

    System.out.println(stringList1.get(0));

  }
}
