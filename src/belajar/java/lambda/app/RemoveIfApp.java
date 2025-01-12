package belajar.java.lambda.app;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfApp {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    list.addAll(List.of("Dyaz", "Amrullah"));

    // remove if anonymous class
//    list.removeIf(new Predicate<String>() {
//      @Override
//      public boolean test(String value) {
//        return value.length() > 4;
//      }
//    });

    // lambda
    list.removeIf(value -> value.length() > 4 );

    System.out.println(list);

  }
}
