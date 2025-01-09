package belajar.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>(1000);

    for (int i = 1; i <= 1000; i++) {
      list.add(i);
    }

    int index = Collections.binarySearch(list, 289);
    System.out.println("dari depan: " + index);

    Comparator<Integer> reverse = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    };

    int index1 = Collections.binarySearch(list, 289);
    System.out.println("dari belakang: " + index1);
  }
}
