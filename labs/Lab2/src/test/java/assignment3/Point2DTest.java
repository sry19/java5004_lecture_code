package assignment3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Point2DTest {
  private Point2D point0;
  private Point2D point1;
  private Point2D point2;

  @Before
  public void setUp() throws Exception {
    point0 = new Point2D(0.0, 0.0);
    point1 = new Point2D(3.0, 4.0);
    point2 = new Point2D(-8.0, -10.0);
  }

  @Test
  public void distToOrigin() {
    assertEquals(0.0, point0.distToOrigin(), 0.01);
    assertEquals(5.0, point1.distToOrigin(), 0.01);
    assertEquals(Math.sqrt(164.0), point2.distToOrigin(), 0.01);
  }

  @Test
  public void getX() {
    assertEquals(0.0, point0.getXpoint(), 0.01);
    assertEquals(3.0, point1.getXpoint(), 0.01);
    assertEquals(-8.0, point2.getXpoint(), 0.01);
  }

  @Test
  public void getY() {
    assertEquals(0.0, point0.getYpoint(), 0.01);
    assertEquals(4.0, point1.getYpoint(), 0.01);
    assertEquals(-10.0, point2.getYpoint(), 0.01);
  }
}