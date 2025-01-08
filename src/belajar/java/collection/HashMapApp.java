package belajar.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();
    map.put("name.first", "Dyaz");
    map.put("name.last", "Amrullah");

    System.out.println(map.get("name.first"));
    System.out.println(map.get("name.last"));
  }
}
