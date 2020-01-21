package assignment2;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class PosnTest {
  Integer testX;
  Integer textY;
  Posn testPosn;
  String resultingString;


  Integer testNotY;
  Posn testPosn2;
  Posn testPosn3;
  Posn testPosn4;

  int resultingHashcode;
  boolean resultingEquals;

  @org.junit.Before
  public void setUp() throws Exception {
    testX = 5;
    textY = 25;
    testNotY = 20;

    testPosn = new Posn(testX, textY);
    resultingString = new String("Posn{" +
        "x=" + testX +
        ", y=" + textY +
        '}');

    testPosn2 = new Posn(testX, textY);
    testPosn3 = new Posn(testX, testNotY);
    testPosn4 = new Posn(testX, textY);

    resultingHashcode = testPosn.hashCode();
    resultingEquals = testPosn.equals(testPosn2);
  }

  @org.junit.Test
  public void getX() {
    assertEquals(testX, testPosn.getX());
  }

  @org.junit.Test
  public void getY() {
    assertEquals(textY, testPosn.getY());
  }

  @org.junit.Test
  public void testEquals() {
    //Testing null-reference
    assertFalse(testPosn.equals(null));

    //Testing reflexivity
    assertEquals(true, testPosn.equals(testPosn));

    //Simple case of equality and non-equality
    assertEquals(true, testPosn.equals(testPosn2));
    assertNotEquals(true, testPosn.equals(testPosn3));

    //Testing symmetry
    assertTrue(testPosn.equals(testPosn2) &&  testPosn2.equals(testPosn));

    assertFalse(testPosn.equals(testPosn3) && testPosn3.equals(testPosn));

    //Testing consistency
    assertEquals(true, testPosn.equals(testPosn2));

    //Testing transitivity
    assertTrue(testPosn.equals(testPosn2) && testPosn2.equals(testPosn4) && testPosn.equals(testPosn4));
  }

  @org.junit.Test
  public void testHashCode() {
    //Testing consistency
    assertEquals(resultingHashcode, testPosn.hashCode());

    //Testing symmetry
    assertEquals(testPosn.hashCode(), testPosn2.hashCode());

    //Testing asymmetry
    assertNotEquals(testPosn.hashCode(), testPosn3.hashCode());
  }

  @org.junit.Test
  public void testToString() {
    assertEquals(resultingString, testPosn.toString());
  }
}