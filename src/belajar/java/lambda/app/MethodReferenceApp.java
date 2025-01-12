package belajar.java.lambda.app;

import belajar.java.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {

  public static void main(String[] args) {

    //Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);

    // Static method reference : if param consistent
    Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

    System.out.println(predicateIsLowerCase.test("Dyaz"));
    System.out.println(predicateIsLowerCase.test("dyaz"));

    MethodReferenceApp test = new MethodReferenceApp();
    test.run();

    // method reference on param
    // Function<String, String> funcUpper = value -> value.toUpperCase();
    Function<String, String> funcUpper = String::toUpperCase;

    System.out.println(funcUpper.apply("dyaz amrullah"));

  }

  public void run(){
    // non static method reference (him self)
    Predicate<String> predicateIsLowerCase = this::isLowerCase;

    System.out.println(predicateIsLowerCase.test("Dyaz"));
    System.out.println(predicateIsLowerCase.test("dyaz"));
  }

  public void run2(){
    // method other object (method reference)
    MethodReferenceApp app = new MethodReferenceApp();

    Predicate<String> predicateIsLowerCase = app::isLowerCase;

    System.out.println(predicateIsLowerCase.test("Dyaz"));
    System.out.println(predicateIsLowerCase.test("dyaz"));
  }

  public boolean isLowerCase(String value){
    for(var c : value.toCharArray()){
      if (!Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }

}
