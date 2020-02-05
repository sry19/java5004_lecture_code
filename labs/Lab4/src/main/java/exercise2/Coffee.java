package exercise2;

public class Coffee extends Beverage {

  public void method3() {
    System.out.println("C 3");
    method2();
  }

  public void tastesAs(Coffee drink) {
    System.out.println("Tastes as Coffee");
  }

  @Override
  public String toString() {
    return "Coffee:"; }
}
