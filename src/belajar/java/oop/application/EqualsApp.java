package belajar.java.oop.application;

public class EqualsApp {
  public static void main(String[] args) {
    String first = "Dyaz";
    first = first + " " + "Amrullah";

    System.out.println(first);

    String second = "Dyaz Amrullah";
    System.out.println(second);

    System.out.println(first == second);
    System.out.println(first.equals(second));

    String third = "Dyaz Amrullah";
    System.out.println(second == third);
    System.out.println(second.equals(third));
  }
}
