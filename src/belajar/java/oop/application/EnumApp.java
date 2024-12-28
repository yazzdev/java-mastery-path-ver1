package belajar.java.oop.application;

import belajar.java.oop.data.Customer;
import belajar.java.oop.data.Level;

public class EnumApp {
  public static void main(String[] args) {

    Customer customer = new Customer();

    customer.setName("Dyaz");
    customer.setLevel(Level.VIP.toString());

    System.out.println(customer.getName());
    System.out.println(customer.getLevel());
    System.out.println(Level.VIP.getDescription());

    String levelName = Level.STANDARD.name();
    System.out.println(levelName);

    Level level = Level.valueOf("PREMIUM");
    System.out.println(level);

    System.out.println("Print Level");
    for (var value : Level.values()) {
      System.out.println(value);
    }

  }
}
