package belajar.java.generic.application;

import belajar.java.generic.MyData;

public class CovariantApp {

  public static void main(String[] args) {

    MyData<String> stringMyData = new MyData<>("Dyaz");
    process(stringMyData);

    MyData<? extends Object> myData = stringMyData;
  }

  public static void process(MyData<? extends Object> myData) {
    System.out.println(myData.getData());

    // myData.setData(1);  // Error: tidak boleh (Read only)
  }

}
