package belajar.java.oop.application;

import belajar.java.oop.data.CreateUserRequest;
import belajar.java.oop.utils.ValidationUtil;

public class ReflectionApp {
  public static void main(String[] args) {

    CreateUserRequest request = new CreateUserRequest();
    request.setUsername("Dyaz");
    request.setPassword("rahasia");
    request.setName("Dyaz");

    ValidationUtil.validationReflection(request);
  }
}
