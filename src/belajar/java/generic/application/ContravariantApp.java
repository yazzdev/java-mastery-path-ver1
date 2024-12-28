package belajar.java.generic.application;

import belajar.java.generic.MyData;

public class ContravariantApp {
  public static void main(String[] args) {
    MyData<Object> objectMyData = new MyData<>("Sinta");
    // objectMyData.setData(1000); // Error: Contravariant harus berhati-hati dengan memperhatikan konversi data nya

    MyData<? super String> myData = objectMyData;

    process(myData);

    System.out.println(objectMyData.getData());
  }

  public static void process(MyData<? super String> myData) {
    String value = (String) myData.getData();
    System.out.println("Process parameter " + value);

    myData.setData("Dyaz Amrullah");
  }
}
