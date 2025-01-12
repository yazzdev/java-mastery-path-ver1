package belajar.java.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {

  public static void main(String[] args) {

    // Interface Supplier : for get
    Supplier<String> supplier = () -> "Dyaz Amrullah";

    System.out.println(supplier.get());

  }

}
