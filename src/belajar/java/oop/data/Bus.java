package belajar.java.oop.data;

public class Bus implements Car {
  @Override
  public void drive() {
    System.out.println("Drive Bus");
  }

  @Override
  public int getTier() {
    return 8;
  }

  @Override
  public boolean isBig() {
    return true;
  }

  @Override
  public String getBrand() {
    return "HINO";
  }

  @Override
  public boolean isMaintenance() {
    return false;
  }
}
