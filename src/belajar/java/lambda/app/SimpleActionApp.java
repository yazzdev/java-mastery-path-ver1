package belajar.java.lambda.app;

import belajar.java.lambda.SimpleAction;

public class SimpleActionApp {

  public static void main(String[] args) {

//    SimpleAction simpleAction = new SimpleAction() {
//      @Override
//      public String action() {
//        return "Dyaz Amrullah with anonymous class";
//      }
//    };
//
//    System.out.println(simpleAction.action());
//
//    SimpleAction simpleAction1 = () -> {
//      return "Dyaz Amrullah with lambda expression";
//    };
//
//    System.out.println(simpleAction1.action());

    SimpleAction simpleAction1 = (String value) -> {
      return "Hello " + value + ", this is lambda expression ver1";
    };
    System.out.println(simpleAction1.action("Dyaz"));

    SimpleAction simpleAction2 = (name) -> {
      return "Hello " + name + ", this is lambda expression ver2";
    };
    System.out.println(simpleAction2.action("Yazid"));

    SimpleAction simpleAction3 = (String value) -> "Hello " + value + ", this is lambda expression ver3";
    System.out.println(simpleAction3.action("Soleh"));

    SimpleAction simpleAction4 = (value) -> "Hello " + value + ", this is lambda expression ver4";
    System.out.println(simpleAction4.action("Rizky"));

    SimpleAction simpleAction5 = name -> "Hello " + name + ", this is lambda expression ver5";
    System.out.println(simpleAction5.action("Harun"));

  }

}
