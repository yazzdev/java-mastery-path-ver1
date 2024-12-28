package belajar.java.generic.application;

import belajar.java.generic.MyData;

public class WildcardApp {
  public static void main(String[] args) {
    print(new MyData<Integer>(1000));
    print(new MyData<String>("Dyaz"));
    print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
  }

  public static void print(MyData<?> myData) {
    System.out.println(myData.getData());
  }
}
