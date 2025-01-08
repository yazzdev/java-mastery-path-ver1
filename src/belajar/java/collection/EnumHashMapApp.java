package belajar.java.collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {

  public static enum Level {
    FREE, STANDARD, PREMIUM, VIP
  }

  public static void main(String[] args) {

    Map<Level, String> map = new EnumMap<>(Level.class);

    map.put(Level.FREE, "Gratis");
    map.put(Level.PREMIUM, "Berbayar");

    for (var key : map.keySet()) {
      System.out.println(map.get(key));
    }

  }
}
