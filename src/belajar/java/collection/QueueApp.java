package belajar.java.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
  public static void main(String[] args) {

    // Queue<String> queue = new ArrayDeque<>(); // Default
    //Queue<String> queue = new PriorityQueue<>(); // Terurut
    Queue<String> queue = new LinkedList<>();

    queue.add("Dyaz");
    queue.add("Amrullah");
    queue.add("Belajar");
    queue.add("Java");
    queue.add("Collections");

    System.out.println("Jml data awal : " + queue.size());

    for (String next = queue.poll(); next != null; next = queue.poll()) {
      System.out.println(next);
    }

    System.out.println("Sisa data : " + queue.size());

  }
}
