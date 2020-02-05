package exercise2;

public class Espresso extends Coffee {

  public void method1() {
    System.out.println("E 1");
    super.method2();
  }

  public void method2() {
    System.out.println("E 2");
  }

  @Override
  public String toString() {
    return "Espresso:"; }
}
