package belajar.java.oop.data;

import belajar.java.oop.annotation.Fancy;

@Fancy(name="Car", tags = {"application", "java"})
public interface Car extends HashBrand, IsMaintenance {

  void drive();

  int getTier();

  default boolean isBig(){
    return false;
  }

}
