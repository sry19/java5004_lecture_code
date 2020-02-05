package exercise2;

public class TestDrinks3 {

  public static void main(String[] args) {
    Beverage bb = new Beverage();
    Beverage bc = new Coffee();
    Coffee cc = new Coffee();

    bb.tastesAs(bb);
    bb.tastesAs(bc);
    bc.tastesAs(bb);
    bc.tastesAs(bc);
    cc.tastesAs(bb);
    cc.tastesAs(bc);
    bb.tastesAs(cc);
    bc.tastesAs(cc);
    cc.tastesAs(cc);
  }
}
