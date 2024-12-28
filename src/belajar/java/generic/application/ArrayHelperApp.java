package belajar.java.generic.application;

import belajar.java.generic.util.ArrayHelper;

public class ArrayHelperApp {

  public static void main(String[] args) {

    String[] names = {"Dyaz", "Amrullah"};
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

    System.out.println(
            ArrayHelper.count(names)
    );

    System.out.println(ArrayHelper.count(
            numbers)
    );

  }

}
