package belajar.java.oop.data;

public class Application {

  public static final int PROCESSORS;

  // Static Block
  static {
    System.out.println("Mengakses class Application");
    PROCESSORS = Runtime.getRuntime().availableProcessors();
  }

}
