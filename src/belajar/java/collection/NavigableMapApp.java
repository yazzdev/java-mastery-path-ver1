package belajar.java.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
  public static void main(String[] args) {

    NavigableMap<String, String> map = new TreeMap<>();

    map.put("Dyaz", "Dyaz");
    map.put("Amrullah", "Amrullah");
    map.put("Yazid", "Yazid");

    System.out.println("----Default----");
    for (var key : map.keySet()) {
      System.out.println(key);
    }

    System.out.println("----Lower and higer----");
    System.out.println(map.lowerKey("Dyaz"));
    System.out.println(map.higherKey("Dyaz"));

    NavigableMap<String, String> mapDesc = map.descendingMap();
    System.out.println("----Desc----");
    for (var key : mapDesc.keySet()) {
      System.out.println(key);
    }

    NavigableMap<String, String> empty = Collections.emptyNavigableMap();
    NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

    // immutable.put("Dyaz", "Ups"); //Error:immutable
  }
}
