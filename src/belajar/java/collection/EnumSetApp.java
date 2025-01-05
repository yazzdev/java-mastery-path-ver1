package belajar.java.collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

  public static enum Gender {
    MALE, FEMALE, NOT_MENTION
  }

  public static void main(String[] args) {

    // If use all of enum
    Set<Gender> genders = EnumSet.allOf(Gender.class);

    for (var gender: genders) {
      System.out.println(gender);
    }

    System.out.println("-----------------");

    // If use specific of enum
    Set<Gender> genders1 = EnumSet.of(Gender.MALE, Gender.FEMALE);

    for (var gender: genders1) {
      System.out.println(gender);
    }
  }
}
