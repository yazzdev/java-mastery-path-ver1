package belajar.java.oop.data;

public class Avanza implements Car {

  @Override
  public void drive() {
    System.out.println("Drive Avanza");
  }

  @Override
  public int getTier() {
    return 4;
  }

  @Override
  public String getBrand() {
    return "Toyota";
  }

  @Override
  public boolean isMaintenance() {
    return false;
  }
}
