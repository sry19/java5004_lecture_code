package problem1;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AthleteTest {

  private Name testName = new Name("Jane", "N", "Doe");
  private Athlete testAthlete1 = new Athlete((new Name("Jane", "N", "Doe")), 5.9, 150.00, "WNBA");
  private Athlete testAthlete2 = new Athlete((new Name("Jane", "N", "Doe")), 5.9, 150.00, "WNBA");

  @Before
  public void setUp() {
  }

  @Test
  public void getAthletesName() {
    TestCase.assertEquals(testName, testAthlete1.getAthletesName());
  }

  @Test
  public void getHeight() {
  }

  @Test
  public void getWeight() {
  }

  @Test
  public void getLeague() {
  }

  @Test
  public void testEquals() {
    TestCase.assertTrue(testAthlete1.equals(testAthlete2));

  }

  @Test
  public void testHashCode() {
  }
}