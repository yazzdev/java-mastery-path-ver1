package belajar.java.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
  public static void main(String[] args) {

    NavigableSet<String> names = new TreeSet<>();
    names.addAll(Set.of("Dyaz", "Amrullah", "Sedang", "Belajar", "Java", "Collections"));

    System.out.println("----Default Set----");
    for (var name : names) {
      System.out.println(name);
    }

    NavigableSet<String> nameReverse = names.descendingSet();

    System.out.println("----Name Reverse----");
    for (var name : nameReverse) {
      System.out.println(name);
    }

    NavigableSet<String> untilBelajar = names.headSet("Belajar", true);

    System.out.println("----Head Set----");
    for (var name : untilBelajar) {
      System.out.println(name);
    }

    NavigableSet<String> fromAmrullah = names.tailSet("Amrullah", false);

    System.out.println("----Tail Set----");
    for (var name : fromAmrullah) {
      System.out.println(name);
    }

    NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
    // immutable.add("Ups"); // Error : Immutable

  }
}
