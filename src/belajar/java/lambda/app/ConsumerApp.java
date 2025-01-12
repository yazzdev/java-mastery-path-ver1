package belajar.java.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
  public static void main(String[] args) {

    // Interface Consumer
    Consumer<String> consumer = value -> System.out.println(value);

    consumer.accept("Dyaz Amrullah");

  }
}
