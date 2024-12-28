package belajar.java.oop;

class VicePresident extends Manager {

  VicePresident(String name){
    super(name);
  }

  void sayHello(String paramName) {
    System.out.println("Hello " + paramName + ", my name is VP " + this.name);
  }
}
