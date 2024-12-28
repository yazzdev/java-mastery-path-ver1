package belajar.java.generic.application;

import belajar.java.generic.Pair;

public class PairApp {

  public static void main(String[] args) {

    Pair<String, Integer> pair = new Pair<>("Dyaz Amrullah", 225);

    System.out.println(pair.getFirst());
    System.out.println(pair.getSecond());

  }

}
