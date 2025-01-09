package belajar.java.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {

  public static void main(String[] args) {

    Map<String, String> map = new Hashtable<>();

    map.put("Dyaz", "Dyaz");
    map.put("Amrullah", "Amrullah");

    for (var value : map.keySet()) {
      System.out.println(value);
    }
  }

}
