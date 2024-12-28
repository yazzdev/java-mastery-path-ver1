package belajar.java.oop;

public class ManagerApp {
  public static void main(String[] args) {

    var manager = new Manager("Dyaz");
    manager.sayHello("Sinta");

    var vp = new VicePresident("Eko");
    vp.sayHello("Budi");
  }
}
