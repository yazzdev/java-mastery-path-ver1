package belajar.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
  public static void main(String[] args) {
    List<String> one = Collections.singletonList("satu");
    List<String> empty = Collections.emptyList();

    List<String> mutable = new ArrayList<>();
    mutable.add("Dyaz");
    mutable.add("Amrullah");
    List<String> immutable = Collections.unmodifiableList(mutable);

    // Immutable List
    List<String> elements = List.of("Dyaz", "Amrullah");
    elements.add("Joko"); // ERROR: Gabisa dirubah
  }
}
