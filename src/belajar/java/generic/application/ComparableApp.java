package belajar.java.generic.application;

import belajar.java.generic.Person;

import java.util.Arrays;

public class ComparableApp {
  public static void main(String[] args) {

    Person[] people = {
      new Person("Dyaz", "Indonesia"),
      new Person("Sinta", "Indonesia"),
      new Person("Budi", "Indonesia")
    };

    Arrays.sort(people);

    System.out.println(Arrays.toString(people));
  }
}
