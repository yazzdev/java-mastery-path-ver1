package belajar.java.generic.application;

import belajar.java.generic.MyData;

public class TypeErasureApp {
  public static void main(String[] args) {
    // ERROR
    MyData myData = new MyData("Dyaz");

    MyData<Integer> integerMyData = (MyData<Integer>) myData;
    Integer integer = integerMyData.getData();
  }
}
