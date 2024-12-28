package belajar.java.oop.application;

import belajar.java.oop.annotation.Fancy;
import belajar.java.oop.data.Animal;
import belajar.java.oop.data.Cat;

@Fancy(name="Animal", tags = {"application", "java"})
public class AnimalApp {
  public static void main(String[] args) {

    Animal animal = new Cat();
    animal.name = "Kitty";

    animal.run();
  }
}
