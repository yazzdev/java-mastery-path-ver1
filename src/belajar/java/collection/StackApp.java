package belajar.java.collection;

import java.util.Stack;

public class StackApp {
  public static void main(String[] args) {

    Stack<String> stack = new Stack<>();

    stack.push("Dyaz");
    stack.push("Amrullah");
    stack.push("Yazid");

    for (var value = stack.pop(); value != null; value = stack.pop()) {
      System.out.println(value);
    }
  }
}
