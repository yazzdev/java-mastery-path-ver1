package belajar.java.oop.application;

import belajar.java.oop.data.Country;
import belajar.java.oop.utils.MathUtil;

import static belajar.java.oop.data.Application.PROCESSORS;
import static belajar.java.oop.data.Constant.APPLICATION;
import static belajar.java.oop.data.Constant.VERSION;

public class StaticApp {
  public static void main(String[] args) {

    // Sebelum Static Import
    // System.out.println(Constant.APPLICATION);
    // System.out.println(Constant.VERSION);

    //Setelah Static Import
    System.out.println(APPLICATION);
    System.out.println(VERSION);

    System.out.println(MathUtil.sum(2, 2, 2, 2, 2));

    Country.City city = new Country.City();
    city.setName("Bandung");

    System.out.println(city.getName());

    //  Sebelum Static Import
    //  System.out.println(Application.PROCESSORS);

    // Setelah Static Import
    System.out.println(PROCESSORS);

  }
}
