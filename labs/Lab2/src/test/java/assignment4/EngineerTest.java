package assignment4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EngineerTest {

  private Engineer engineer0;
  private Engineer engineer1;
  private Engineer engineer2;

  private Engineer expEngineer0;
  private Engineer expEngineer1;
  private Engineer expEngineer2;

  @Before
  public void setUp() throws Exception {
    engineer0 = new Engineer(new Name("Gage", "Slime"), 0, 0d);
    engineer1 = new Engineer(new Name("Lebron", "James"), 40, 40d);
    engineer2 = new Engineer(new Name("Sarah", "Fly"), 128, 100d);
  }

  @Test(expected = IncorrectAgeRangeException.class)
  public void illegalAgeWorkNegative() throws Exception {
    new Engineer(new Name("a", "b"), -1, 50d);
  }

  @Test(expected = IncorrectAgeRangeException.class)
  public void illegalAgeWorkTooHigh() throws Exception {
    new Engineer(new Name("a", "b"), 129, 50d);
  }

  @Test(expected = IncorrectWealthValueException.class)
  public void illegalWealthValue1() throws Exception {
    new Engineer(new Name("a", "b"), 50, -1d);
  }

  @Test(expected = IncorrectWealthValueException.class)
  public void illegalWealthValue2() throws Exception {
    new Engineer(new Name("a", "b"), 50, -60d);
  }

  @Test
  public void getWealth() {
    assertEquals(new Double(0), engineer0.getWealth());
    assertEquals(new Double(40), engineer1.getWealth());
    assertEquals(new Double(100), engineer2.getWealth());
  }

  @Test
  public void getName() {
    assertEquals(new Name("Gage", "Slime"), engineer0.getName());
    assertEquals(new Name("Lebron", "James"), engineer1.getName());
    assertEquals(new Name("Sarah", "Fly"), engineer2.getName());
  }

  @Test
  public void getAge() {
    assertEquals(new Integer(0), engineer0.getAge());
    assertEquals(new Integer(40), engineer1.getAge());
    assertEquals(new Integer(128), engineer2.getAge());
  }

  @Test
  public void increaseWealth() {
    expEngineer0 = new Engineer(new Name("Gage", "Slime"), 0, 50d);
    expEngineer1 = new Engineer(new Name("Lebron", "James"), 55, 70d);
    expEngineer2 = new Engineer(new Name("Sarah", "Fly"), 128, 100d);

    assertEquals(expEngineer0, engineer0.increaseWealth(50d));
    assertEquals(expEngineer1, engineer1.increaseWealth(30d));
    assertEquals(expEngineer2, engineer2.increaseWealth(0d));
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalIncreaseWealth() throws Exception {
    engineer0.increaseWealth(-1d);
  }

  @Test
  public void decreaseWealth() {
    expEngineer0 = new Engineer(new Name("Gage", "Slime"), 0, 0d);
    expEngineer1 = new Engineer(new Name("Lebron", "James"), 55, 25d);
    expEngineer2 = new Engineer(new Name("Sarah", "Fly"), 128, 40d);

    assertEquals(expEngineer0, engineer0.decreaseWealth(0d));
    assertEquals(expEngineer1, engineer1.decreaseWealth(15d));
    assertEquals(expEngineer2, engineer2.decreaseWealth(60d));
  }

  @Test
  public void decreaseWealthErrorHandling() {
    expEngineer0 = new Engineer(new Name("Gage", "Slime"), 0, 0d);
    expEngineer1 = new Engineer(new Name("Lebron", "James"), 55, 0d);
    expEngineer2 = new Engineer(new Name("Sarah", "Fly"), 128, 0d);

    assertEquals(expEngineer0, engineer0.decreaseWealth(10d));
    assertEquals(expEngineer1, engineer1.decreaseWealth(45d));
    assertEquals(expEngineer2, engineer2.decreaseWealth(140d));
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalDecreaseWealth() throws Exception {
    engineer0.decreaseWealth(-1d);
  }

  @Test
  public void equals() {
    expEngineer0 = new Engineer(new Name("Gage", "Slime"), 0, 0d);

    assertTrue(engineer0.equals(engineer0));
    assertFalse(engineer0.equals(null));
    assertFalse(engineer0.equals(engineer1));
    assertTrue(engineer0.equals(expEngineer0));
    assertFalse(engineer0.equals(new Integer(9)));
  }

  @Test
  public void hashCodeTest() {
    expEngineer0 = new Engineer(new Name("Gage", "Slime"), 0, 0d);
    Double test0 = new Double(9d);

    assertEquals(engineer0.hashCode(), engineer0.hashCode());
    assertNotEquals(engineer0.hashCode(), engineer1.hashCode());
    assertEquals(engineer0.hashCode(), expEngineer0.hashCode());
    assertNotEquals(engineer0.hashCode(), test0.hashCode());
  }
}