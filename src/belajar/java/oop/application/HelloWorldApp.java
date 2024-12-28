package belajar.java.oop.application;

import belajar.java.oop.data.HelloWorld;

public class HelloWorldApp {
  public static void main(String[] args) {

    HelloWorld english = new HelloWorld() {
      @Override
      public void sayHello() {
        System.out.println("Hello");
      }

      @Override
      public void sayHello(String name) {
        System.out.println("Hello " + name);
      }
    };

    HelloWorld indonesia = new HelloWorld() {
      @Override
      public void sayHello() {
        System.out.println("Hello");
      }

      @Override
      public void sayHello(String name) {
        System.out.println("Hello " + name);
      }
    };

    english.sayHello();
    english.sayHello("Dyaz");

    indonesia.sayHello();
    indonesia.sayHello("Yasa");
  }
}
