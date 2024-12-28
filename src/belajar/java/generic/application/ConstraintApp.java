package belajar.java.generic.application;

public class ConstraintApp {
  public static void main(String[] args) {
    NumberData<Integer> integerNumberData = new NumberData<>(120);
    NumberData<Double> doubleNumberData = new NumberData<>(1.2);

    // NumberData<String> stringNumberData = new NumberData<>("Dyaz"); // Error: Out of bound
  }

  public static class NumberData<T extends Number> {
    private T data;

    public NumberData(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }
  }
}
