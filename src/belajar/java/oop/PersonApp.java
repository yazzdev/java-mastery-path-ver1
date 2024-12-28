package belajar.java.oop;

public class PersonApp {
  public static void main(String[] args) {

    var person1 = new Person("Dyaz", "Jakarta");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Eko");

    Person person2 = new Person("Budi");
    person2.sayHello("Nala");

    Person person3;
    person3 = new Person();
    person3.name = "Sinta";
    person3.sayHello("Dyaz");
  }
}