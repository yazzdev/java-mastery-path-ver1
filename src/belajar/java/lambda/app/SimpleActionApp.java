package belajar.java.lambda.app;

import belajar.java.lambda.SimpleAction;

public class SimpleActionApp {

  public static void main(String[] args) {

    SimpleAction simpleAction = new SimpleAction() {
      @Override
      public String action() {
        return "Dyaz Amrullah with anonymous class";
      }
    };

    System.out.println(simpleAction.action());

    SimpleAction simpleAction1 = () -> {
      return "Dyaz Amrullah with lambda expression";
    };

    System.out.println(simpleAction1.action());

  }

}
