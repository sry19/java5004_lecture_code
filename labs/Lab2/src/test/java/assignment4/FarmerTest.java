package assignment4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FarmerTest {

  private Farmer farmer0;
  private Farmer farmer1;
  private Farmer farmer2;

  private Farmer expFarmer0;
  private Farmer expFarmer1;
  private Farmer expFarmer2;

  @Before
  public void setUp() throws Exception {
    farmer0 = new Farmer(new Name("Harry", "Potter"), 0, 0d);
    farmer1 = new Farmer(new Name("Kyle", "Lake"), 55, 10d);
    farmer2 = new Farmer(new Name("Peter", "Humble"), 128, 100d);
  }

  @Test(expected = IncorrectAgeRangeException.class)
  public void illegalAgeWorkNegative() throws Exception {
    new Farmer(new Name("a", "b"), -1, 50d);
  }

  @Test(expected = IncorrectAgeRangeException.class)
  public void illegalAgeWorkTooHigh() throws Exception {
    new Farmer(new Name("a", "b"), 129, 50d);
  }

  @Test(expected = IncorrectWealthValueException.class)
  public void illegalWealthValue1() throws Exception {
    new Farmer(new Name("a", "b"), 50, -1d);
  }

  @Test(expected = IncorrectWealthValueException.class)
  public void illegalWealthValue2() throws Exception {
    new Farmer(new Name("a", "b"), 50, -60d);
  }

  @Test
  public void getName() {
    assertEquals(new Name("Harry", "Potter"), farmer0.getName());
    assertEquals(new Name("Kyle", "Lake"), farmer1.getName());
    assertEquals(new Name("Peter", "Humble"), farmer2.getName());
  }

  @Test
  public void getAge() {
    assertEquals(new Integer(0), farmer0.getAge());
    assertEquals(new Integer(55), farmer1.getAge());
    assertEquals(new Integer(128), farmer2.getAge());
  }

  @Test
  public void getWealth() {
    assertEquals(new Double(0), farmer0.getWealth());
    assertEquals(new Double(10), farmer1.getWealth());
    assertEquals(new Double(100), farmer2.getWealth());
  }

  @Test
  public void increaseWealth() {
    expFarmer0 = new Farmer(new Name("Harry", "Potter"), 0, 10d);
    expFarmer1 = new Farmer(new Name("Kyle", "Lake"), 55, 50d);
    expFarmer2 = new Farmer(new Name("Peter", "Humble"), 128, 100d);

    assertEquals(expFarmer0, farmer0.increaseWealth(10d));
    assertEquals(expFarmer1, farmer1.increaseWealth(40d));
    assertEquals(expFarmer2, farmer2.increaseWealth(0d));
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalIncreaseWealth() throws Exception {
    farmer0.increaseWealth(-1d);
  }

  @Test
  public void decreaseWealth() {
    expFarmer0 = new Farmer(new Name("Harry", "Potter"), 0, 0d);
    expFarmer1 = new Farmer(new Name("Kyle", "Lake"), 55, 5d);
    expFarmer2 = new Farmer(new Name("Peter", "Humble"), 128, 20d);

    assertEquals(expFarmer0, farmer0.decreaseWealth(0d));
    assertEquals(expFarmer1, farmer1.decreaseWealth(5d));
    assertEquals(expFarmer2, farmer2.decreaseWealth(80d));
  }

  @Test
  public void decreaseWealthErrorHandling() {
    expFarmer0 = new Farmer(new Name("Harry", "Potter"), 0, 0d);
    expFarmer1 = new Farmer(new Name("Kyle", "Lake"), 55, 0d);
    expFarmer2 = new Farmer(new Name("Peter", "Humble"), 128, 0d);

    assertEquals(expFarmer0, farmer0.decreaseWealth(50d));
    assertEquals(expFarmer1, farmer1.decreaseWealth(20d));
    assertEquals(expFarmer2, farmer2.decreaseWealth(110d));
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalDecreaseWealth() throws Exception {
    farmer0.decreaseWealth(-1d);
  }

  @Test
  public void equals() {
    expFarmer0 = new Farmer(new Name("Harry", "Potter"), 0, 0d);

    assertTrue(farmer0.equals(farmer0));
    assertFalse(farmer0.equals(null));
    assertFalse(farmer0.equals(farmer1));
    assertTrue(farmer0.equals(expFarmer0));
    assertFalse(farmer0.equals(new Integer(9)));
  }

  @Test
  public void hashCodeTest() {
    expFarmer0 = new Farmer(new Name("Harry", "Potter"), 0, 0d);
    Double test0 = new Double(9d);

    assertEquals(farmer0.hashCode(), farmer0.hashCode());
    assertNotEquals(farmer0.hashCode(), farmer1.hashCode());
    assertEquals(farmer0.hashCode(), expFarmer0.hashCode());
    assertNotEquals(farmer0.hashCode(), test0.hashCode());
  }
}