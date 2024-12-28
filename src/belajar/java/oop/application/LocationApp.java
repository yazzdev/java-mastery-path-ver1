package belajar.java.oop.application;

import belajar.java.oop.data.City;

public class LocationApp {
  public static void main(String[] args) {

    // var location = new Location(); -> Error: abstract cannot be instantiated
    City city = new City();
    city.name = "Jakarta";

    System.out.println(city.name);

  }
}
