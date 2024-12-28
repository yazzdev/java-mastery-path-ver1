package belajar.java.oop;

public class PolymorphismApp {
  public static void main(String[] args) {

    Employee employee = new Employee("Dyaz");
    employee.sayHello("Sinta");

    employee = new Manager("Dyaz");
    employee.sayHello("Sinta");

    employee = new VicePresident("Dyaz");
    employee.sayHello("Sinta");

    sayHello(new Employee("Dyaz"));
    sayHello(new Manager("Sinta"));
    sayHello(new VicePresident("Eko"));
  }

  static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println("Hello VP " + vicePresident.name);
    } else if (employee instanceof Manager){
      Manager manager = (Manager) employee;
      System.out.println("Hello Manager " + manager.name);
    } else {
      System.out.println("Hello " + employee.name);
    }
  }
}
