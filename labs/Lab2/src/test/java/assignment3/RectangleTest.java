package assignment3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
  private Rectangle rect0;
  private Rectangle rect1;

  @Before
  public void setUp() throws Exception {
    rect0 = new Rectangle(0, 0, 5, 5);
    rect1 = new Rectangle(100, -99, 10, 2);

  }

  @Test(expected = InvalidDimensionsException.class)
  public void illegalWidth() throws Exception {
    rect0 = new Rectangle(0, 0, -10, 5);
  }

  @Test(expected = InvalidDimensionsException.class)
  public void illegalZeroWidth() throws Exception {
    rect0 = new Rectangle(0, 0, 0, 5);
  }

  @Test(expected = InvalidDimensionsException.class)
  public void illegalHeight() throws Exception {
    rect0 = new Rectangle(0, 0, 5, -5);
  }

  @Test(expected = InvalidDimensionsException.class)
  public void illegalZeroHeight() throws Exception {
    rect0 = new Rectangle(0, 0, 5, 0);
  }

  @Test(expected = InvalidFactorException.class)
  public void illegalFactor() throws Exception {
    Shape shape0 = rect0.resize(-9);
  }

  @Test(expected = InvalidFactorException.class)
  public void illegalZeroFactor() throws Exception {
    Shape shape1 = rect1.resize(0);
  }

  @Test
  public void area() {
    assertEquals(25, rect0.area(), 0.01);
    assertEquals(20, rect1.area(), 0.01);
  }

  @Test
  public void perimeter() {
    assertEquals(20, rect0.perimeter(), 0.01);
    assertEquals(24, rect1.perimeter(), 0.01);
  }

  @Test
  public void resize() {
    assertEquals(new Rectangle(0, 0, 10, 10), rect0.resize(4));
    assertEquals(new Rectangle(100, -99, 50, 10), rect1.resize(25));
  }

  @Test
  public void testToString() {
    assertEquals("Rectangle: LL corner (0.000,0.000) width 5.000 height 5.000", rect0.toString());
    assertEquals("Rectangle: LL corner (100.000,-99.000) width 10.000 height 2.000", rect1.toString());
  }

  @Test
  public void equals() {
    assertTrue(rect0.equals(new Rectangle(0, 0, 5, 5)));
    assertTrue(rect1.equals(new Rectangle(100, -99, 10, 2)));
    assertFalse(rect0.equals(new Integer(5)));
  }

  @Test
  public void testHashCode() {
    Rectangle similar0 = new Rectangle(0, 0, 5, 5);
    assertEquals(similar0.hashCode(), rect0.hashCode());
    assertNotEquals(rect0.hashCode(), rect1.hashCode());
  }
}