package belajar.java.collection;

import belajar.java.collection.data.Person;
import belajar.java.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
  public static void main(String[] args) {

    SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

    people.add(new Person("Dyaz"));
    people.add(new Person("Amrullah"));
    people.add(new Person("Sinta"));

    for (var person : people) {
      System.out.println(person.getName());
    }

    SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);

    // sortedSet.add(new Person("Joko")); // Error : sudah diganti menjadi immutable

  }
}
