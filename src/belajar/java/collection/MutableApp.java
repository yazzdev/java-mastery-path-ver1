package belajar.java.collection;

import belajar.java.collection.data.Person;

import java.util.List;

public class MutableApp {
  public static void main(String[] args) {
    Person person = new Person("Dyaz");

    person.addHobby("Coding");
    person.addHobby("Tidur");

    doSomethingWithHobbies(person.getHobbies());

    for (var hobby:
         person.getHobbies()) {
      System.out.println(hobby);
    }
  }

  public static void doSomethingWithHobbies(List<String> hobbies) {
    hobbies.add("Bukan Hobby");
  }
}
