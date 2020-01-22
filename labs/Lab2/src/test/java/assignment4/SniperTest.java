package assignment4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SniperTest {

  private Sniper sniper0;
  private Sniper sniper1;
  private Sniper sniper2;

  private Sniper expSniper0;
  private Sniper expSniper1;
  private Sniper expSniper2;

  @Before
  public void setUp() throws Exception {
    sniper0 = new Sniper(new Name("Ron", "Weasley"), 0, 50d);
    sniper1 = new Sniper(new Name("Donald", "Hall"), 20, 80d);
    sniper2 = new Sniper(new Name("Tamara", "Bonaci"), 128, 20d);
  }

  @Test(expected = IncorrectAgeRangeException.class)
  public void illegalAgeWorkNegative() throws Exception {
    new Sniper(new Name("a", "b"), -1, 50d);
  }

  @Test(expected = IncorrectAgeRangeException.class)
  public void illegalAgeWorkTooHigh() throws Exception {
    new Sniper(new Name("a", "b"), 129, 50d);
  }

  @Test(expected = IncorrectStrengthValueException.class)
  public void illegalStrengthValueNegative() throws Exception {
    new Sniper(new Name("a", "b"), 50, -1d);
  }

  @Test(expected = IncorrectStrengthValueException.class)
  public void illegalStrengthValueTooHigh() throws Exception {
    new Sniper(new Name("a", "b"), 50, 101d);
  }

  @Test
  public void getName() {
    assertEquals(new Name("Ron", "Weasley"), sniper0.getName());
    assertEquals(new Name("Donald", "Hall"), sniper1.getName());
    assertEquals(new Name("Tamara", "Bonaci"), sniper2.getName());
  }

  @Test
  public void getAge() {
    assertEquals(new Integer(0), sniper0.getAge());
    assertEquals(new Integer(20), sniper1.getAge());
    assertEquals(new Integer(128), sniper2.getAge());
  }

  @Test
  public void getStamina() {
    assertEquals(new Double(50d), sniper0.getStamina());
    assertEquals(new Double(80d), sniper1.getStamina());
    assertEquals(new Double(20d), sniper2.getStamina());
  }

  @Test
  public void increaseStamina() throws Exception {
    expSniper0 = new Sniper(new Name("Ron", "Weasley"), 0, 60d);
    expSniper1 = new Sniper(new Name("Donald", "Hall"), 20, 85d);
    expSniper2 = new Sniper(new Name("Tamara", "Bonaci"), 128, 90d);

    assertEquals(expSniper0, sniper0.increaseStamina(10d));
    assertEquals(expSniper1, sniper1.increaseStamina(5d));
    assertEquals(expSniper2, sniper2.increaseStamina(70d));
  }

  @Test
  public void increaseStaminaErrorHandling() throws Exception {
    expSniper0 = new Sniper(new Name("Ron", "Weasley"), 0, 100d);
    expSniper1 = new Sniper(new Name("Donald", "Hall"), 20, 100d);
    expSniper2 = new Sniper(new Name("Tamara", "Bonaci"), 128, 100d);

    assertEquals(expSniper0, sniper0.increaseStamina(900d));
    assertEquals(expSniper1, sniper1.increaseStamina(30d));
    assertEquals(expSniper2, sniper2.increaseStamina(100d));
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalIncreaseStamina() throws Exception {
    sniper0.increaseStamina(-1d);
  }

  @Test
  public void decreaseStamina() throws Exception {
    expSniper0 = new Sniper(new Name("Ron", "Weasley"), 0, 30d);
    expSniper1 = new Sniper(new Name("Donald", "Hall"), 20, 10d);
    expSniper2 = new Sniper(new Name("Tamara", "Bonaci"), 128, 5d);

    assertEquals(expSniper0, sniper0.decreaseStamina(20d));
    assertEquals(expSniper1, sniper1.decreaseStamina(70d));
    assertEquals(expSniper2, sniper2.decreaseStamina(15d));
  }

  @Test
  public void decreaseStaminaErrorHandling() throws Exception {
    expSniper0 = new Sniper(new Name("Ron", "Weasley"), 0, 0d);
    expSniper1 = new Sniper(new Name("Donald", "Hall"), 20, 0d);
    expSniper2 = new Sniper(new Name("Tamara", "Bonaci"), 128, 0d);

    assertEquals(expSniper0, sniper0.decreaseStamina(60d));
    assertEquals(expSniper1, sniper1.decreaseStamina(90d));
    assertEquals(expSniper2, sniper2.decreaseStamina(50d));
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalDecreaseStamina() throws Exception {
    sniper0.decreaseStamina(-1d);
  }

  @Test
  public void equals() {
    expSniper0 = new Sniper(new Name("Ron", "Weasley"), 0, 50d);

    assertTrue(sniper0.equals(sniper0));
    assertFalse(sniper0.equals(null));
    assertFalse(sniper0.equals(sniper1));
    assertTrue(sniper0.equals(expSniper0));
    assertFalse(sniper0.equals(new Integer(9)));
  }

  @Test
  public void hashCodeTest() {
    expSniper0 = new Sniper(new Name("Ron", "Weasley"), 0, 50d);
    Double test0 = new Double(9d);

    assertEquals(sniper0.hashCode(), sniper0.hashCode());
    assertNotEquals(sniper0.hashCode(), sniper1.hashCode());
    assertEquals(sniper0.hashCode(), expSniper0.hashCode());
    assertNotEquals(sniper0.hashCode(), test0.hashCode());
  }
}