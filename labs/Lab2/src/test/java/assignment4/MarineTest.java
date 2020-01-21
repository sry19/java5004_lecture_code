package assignment4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MarineTest {

  private Marine marine0;
  private Marine marine1;
  private Marine marine2;

  private Marine expMarine0;
  private Marine expMarine1;
  private Marine expMarine2;

  @Before
  public void setUp() throws Exception {
    marine0 = new Marine(new Name("Hermione", "Granger"), 0, 20d);
    marine1 = new Marine(new Name("John", "Broadbent"), 55, 55d);
    marine2 = new Marine(new Name("Barry", "Bonds"), 128, 80d);
  }

  @Test(expected = IncorrectAgeRangeException.class)
  public void illegalAgeWorkNegative() throws Exception {
    new Marine(new Name("a", "b"), -1, 50d);
  }

  @Test(expected = IncorrectAgeRangeException.class)
  public void illegalAgeWorkTooHigh() throws Exception {
    new Marine(new Name("a", "b"), 129, 50d);
  }

  @Test(expected = IncorrectStrengthValueException.class)
  public void illegalStrengthValueNegative() throws Exception {
    new Marine(new Name("a", "b"), 50, -1d);
  }

  @Test(expected = IncorrectStrengthValueException.class)
  public void illegalStrengthValueTooHigh() throws Exception {
    new Marine(new Name("a", "b"), 50, 101d);
  }

  @Test
  public void getName() {
    assertEquals(new Name("Hermione", "Granger"), marine0.getName());
    assertEquals(new Name("John", "Broadbent"), marine1.getName());
    assertEquals(new Name("Barry", "Bonds"), marine2.getName());
  }

  @Test
  public void getAge() {
    assertEquals(new Integer(0), marine0.getAge());
    assertEquals(new Integer(55), marine1.getAge());
    assertEquals(new Integer(128), marine2.getAge());
  }

  @Test
  public void getStamina() {
    assertEquals(new Double(20d), marine0.getStamina());
    assertEquals(new Double(55d), marine1.getStamina());
    assertEquals(new Double(80d), marine2.getStamina());
  }

  @Test
  public void increaseStamina() throws Exception {
    expMarine0 = new Marine(new Name("Hermione", "Granger"), 0, 40d);
    expMarine1 = new Marine(new Name("John", "Broadbent"), 55, 95d);
    expMarine2 = new Marine(new Name("Barry", "Bonds"), 128, 90d);

    assertEquals(expMarine0, marine0.increaseStamina(20d));
    assertEquals(expMarine1, marine1.increaseStamina(40d));
    assertEquals(expMarine2, marine2.increaseStamina(10d));
  }

  @Test
  public void increaseStaminaErrorHandling() throws Exception {
    expMarine0 = new Marine(new Name("Hermione", "Granger"), 0, 100d);
    expMarine1 = new Marine(new Name("John", "Broadbent"), 55, 100d);
    expMarine2 = new Marine(new Name("Barry", "Bonds"), 128, 100d);

    assertEquals(expMarine0, marine0.increaseStamina(100d));
    assertEquals(expMarine1, marine1.increaseStamina(55d));
    assertEquals(expMarine2, marine2.increaseStamina(40d));
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalIncreaseStamina() throws Exception {
    marine0.increaseStamina(-1d);
  }

  @Test
  public void decreaseStamina() throws Exception {
    expMarine0 = new Marine(new Name("Hermione", "Granger"), 0, 15d);
    expMarine1 = new Marine(new Name("John", "Broadbent"), 55, 35d);
    expMarine2 = new Marine(new Name("Barry", "Bonds"), 128, 50d);

    assertEquals(expMarine0, marine0.decreaseStamina(5d));
    assertEquals(expMarine1, marine1.decreaseStamina(20d));
    assertEquals(expMarine2, marine2.decreaseStamina(30d));
  }

  @Test
  public void decreaseStaminaErrorHandling() throws Exception {
    expMarine0 = new Marine(new Name("Hermione", "Granger"), 0, 0d);
    expMarine1 = new Marine(new Name("John", "Broadbent"), 55, 0d);
    expMarine2 = new Marine(new Name("Barry", "Bonds"), 128, 0d);

    assertEquals(expMarine0, marine0.decreaseStamina(30d));
    assertEquals(expMarine1, marine1.decreaseStamina(60d));
    assertEquals(expMarine2, marine2.decreaseStamina(110d));
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalDecreaseStamina() throws Exception {
    marine0.decreaseStamina(-1d);
  }

  @Test
  public void equals() {
    expMarine0 = new Marine(new Name("Hermione", "Granger"), 0, 20d);

    assertTrue(marine0.equals(marine0));
    assertFalse(marine0.equals(null));
    assertFalse(marine0.equals(marine1));
    assertTrue(marine0.equals(expMarine0));
    assertFalse(marine0.equals(new Integer(9)));
  }

  @Test
  public void hashCodeTest() {
    expMarine0 = new Marine(new Name("Hermione", "Granger"), 0, 20d);
    Double test0 = new Double(9d);

    assertEquals(marine0.hashCode(), marine0.hashCode());
    assertNotEquals(marine0.hashCode(), marine1.hashCode());
    assertEquals(marine0.hashCode(), expMarine0.hashCode());
    assertNotEquals(marine0.hashCode(), test0.hashCode());
  }
}