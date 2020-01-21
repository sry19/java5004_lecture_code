package assignment4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {
  private Name name0;
  private Name name1;
  private Name name2;

  @Before
  public void setUp() throws Exception {
    name0 = new Name("Harry", "Potter");
    name1 = new Name("Donald", "Hall");
    name2 = new Name("Justin", "Bieber");
  }

  @Test
  public void getFirstName() {
    assertEquals("Harry", name0.getFirstName());
    assertEquals("Donald", name1.getFirstName());
    assertEquals("Justin", name2.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Potter", name0.getLastName());
    assertEquals("Hall", name1.getLastName());
    assertEquals("Bieber", name2.getLastName());
  }

  @Test
  public void equals() {
    Name expName0 = new Name("Harry", "Potter");

    assertTrue(name0.equals(name0));
    assertFalse(name0.equals(null));
    assertFalse(name0.equals(name1));
    assertTrue(name0.equals(expName0));
    assertFalse(name0.equals(new Integer(2)));
  }

  @Test
  public void hashCodeTest() {
    Name expName0 = new Name("Harry", "Potter");
    Integer test0 = new Integer(9);

    assertEquals(name0.hashCode(), name0.hashCode());
    assertNotEquals(name0.hashCode(), name1.hashCode());
    assertEquals(name0.hashCode(), expName0.hashCode());
    assertNotEquals(name0.hashCode(), test0.hashCode());
  }
}