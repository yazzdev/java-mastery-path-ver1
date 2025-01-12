package belajar.java.lambda.app;

import java.util.function.Supplier;

public class LazyApp {
  public static void testScore(int score, Supplier<String> name) {
    if (score > 75) {
      System.out.println(name.get() + " anda lulus!");
    } else {
      System.out.println("Anda tidak lulus!");
    }
  }

  public static String getName() {
    System.out.println("<method dipanggil>");
    return "Dyaz";
  }

  public static void main(String[] args) {
    testScore(80, () -> getName());
  }
}
