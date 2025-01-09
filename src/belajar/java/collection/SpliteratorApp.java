package belajar.java.collection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
  public static void main(String[] args) {

    List<String> list = List.of("Dyaz", "Amrullah", "Joko", "Budi", "Umar", "Yazid", "Kodim");

    Spliterator<String> spliterator1 = list.spliterator();
    Spliterator<String> spliterator2 = spliterator1.trySplit();

    System.out.println(spliterator1.estimateSize());
    System.out.println(spliterator2.estimateSize());

    System.out.println("----Spliterator1----");
    spliterator1.forEachRemaining(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });

    System.out.println("----Spliterator2----");
    spliterator2.forEachRemaining(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });

  }
}
