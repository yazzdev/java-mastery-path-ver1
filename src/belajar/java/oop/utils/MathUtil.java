package belajar.java.oop.utils;

public class MathUtil {

  //Static Method
  public static int sum(int... values) {
    int total = 0;
    for (var value : values) {
      total += value;
    }
    return total;
  }

}
