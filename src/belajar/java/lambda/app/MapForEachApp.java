package belajar.java.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {

  public static void main(String[] args) {

    Map<String, String> names = new HashMap<>();

    names.put("firstName", "Dyaz");
    names.put("lastName", "Dyaz");

    // for loop
    for (var name : names.entrySet()) {
      System.out.println(name.getKey() + " : " + name.getValue());
    }

    // forEach anonymous class
    names.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String key, String value) {
        System.out.println(key + " : " + value);
      }
    });

    // lamda
    names.forEach((key, value) -> System.out.println(key + " : " + value));

  }

}
