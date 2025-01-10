package belajar.java.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {

  public static void main(String[] args) {

    // Interfave predicate : return boolean
    Predicate<String> predicateCheckBlank = value -> value.isBlank();

    System.out.println(predicateCheckBlank.test(""));
    System.out.println(predicateCheckBlank.test("Dyaz"));

  }

}
