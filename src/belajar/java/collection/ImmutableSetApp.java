package belajar.java.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
  public static void main(String[] args) {

    Set<String> empty = Collections.emptySet();
    Set<String> one = Collections.singleton("Dyaz");

    Set<String> mutable = new HashSet<>();
    mutable.add("Dyaz");
    mutable.add("Amrullah");
    Set<String> immutable = Collections.unmodifiableSet(mutable);

    Set<String> set = Set.of("Dyaz", "Amrullah");

    // set.add("Yaz"); // Error
    // set.remove("Dyaz"); // Error

  }
}
