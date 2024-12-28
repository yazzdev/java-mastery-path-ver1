package belajar.java.oop.application;

import belajar.java.oop.annotation.Fancy;
import belajar.java.oop.data.LoginRequest;
import belajar.java.oop.error.ValidationException;
import belajar.java.oop.utils.ValidationUtil;

public class ValidationApp {

  @Fancy(name="Login", tags = {"application", "java"})
  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest("", null);

    try {
      ValidationUtil.validate(loginRequest);
      System.out.println("Data valid");
    } catch (ValidationException exception) {
      System.out.println("Data tidak valid : " + exception.getMessage());
    } catch (NullPointerException exception) {
      System.out.println("Data Null : " + exception.getMessage());
    }

    LoginRequest loginRequest2 = new LoginRequest(null, null);

    try {
      ValidationUtil.validate(loginRequest2);
      System.out.println("Data valid");
    } catch (ValidationException | NullPointerException exception) {
      System.out.println("Data tidak valid : " + exception.getMessage());
    } finally {
      System.out.println("Gak Error, Selalu di eksekusi!!");
    }

    LoginRequest loginRequest3 = new LoginRequest(null, null);
    ValidationUtil.validateRuntime(loginRequest3);
    System.out.println("sukses");

  }
}
