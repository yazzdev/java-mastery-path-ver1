package belajar.java.lambda.app;

import java.util.function.Function;

public class FinctionApp {

  public static void main(String[] args) {

    // Interface Function
    Function<String, Integer> functionLength = value -> value.length();

    System.out.println(functionLength.apply("Dyaz"));

  }

}
