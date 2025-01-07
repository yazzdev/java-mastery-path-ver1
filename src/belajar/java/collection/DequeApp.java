package belajar.java.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
  public static void main(String[] args) {

    Deque<String> stack = new LinkedList<>();

    stack.offerLast("Dyaz");
    stack.offerLast("Amrullah");

    System.out.println("----Stack----");
    System.out.println(stack.pollLast());
    System.out.println(stack.pollLast());

    Deque<String> queue = new LinkedList<>();

    queue.offerLast("Dyaz");
    queue.offerLast("Amrullah");

    System.out.println("----Queue----");
    System.out.println(queue.pollFirst());
    System.out.println(queue.pollFirst());

  }
}
