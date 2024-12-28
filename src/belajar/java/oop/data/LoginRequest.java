package belajar.java.oop.data;

public record LoginRequest(String username, String password) {

  public LoginRequest {
    System.out.println("Belajar java class record!!");
  }

  public LoginRequest(String username) {
    this(username, "");
  }

  public LoginRequest() {
    this("", "");
  }
}
